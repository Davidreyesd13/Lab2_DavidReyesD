package lab2_davidreyes;

import java.util.Scanner;

public class Lab2_DavidReyes {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        char resp = 's';
        while (resp == 's' || resp == 'S') {

            System.out.println("Ingrese el usuario: ");
            String user = leer.next();
            System.out.println("Ingrese el password: ");
            String pass = leer.next();
            while (user.equals("david") && pass.equals("99")) {
                System.out.println("1.Generar reporte de restaurantes\n2.Manejo de restaurante\n0.Salir");
                int opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("1.Listar los restaurantes segun su estado\n2.Listar Restaurantes premium\n3.restaurantes segun su franquisia\n4."
                                + "Generentes que manejan mas de 2 restaurantes");
                        int r1 = leer.nextInt();
                        switch (r1) {
                            case 1:

                                break;
                            case 2:
                                
                                break;
                            case 3:
                                
                                break;
                            case 4:
                                
                                break;
                        }
                        break;
                    case 2:

                        break;
                    case 0:
                        System.out.println("Gracias hasta luego ");
                        System.exit(0);
                    default:
                        System.out.println("Gracias hasta luego ");
                        System.exit(0);
                }
            }
            System.out.println("Desea continuar S/N");
            resp= leer.next().charAt(0);
        }
    }

}
