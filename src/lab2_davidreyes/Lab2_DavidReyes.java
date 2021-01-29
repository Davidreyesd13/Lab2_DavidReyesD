package lab2_davidreyes;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab2_DavidReyes {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList listaRe = new ArrayList();
        ArrayList listapre = new ArrayList();
        ArrayList gerente = new ArrayList();
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
                                System.out.println("1.Funcional\n2.Remodelacion\n3.Demolicion");
                                int ep = leer.nextInt();//ep= estado opcion
                                switch (ep) {
                                    case 1:
                                        for (Object t : listaRe) {
                                            //if (t instanceof restaurante) {
                                            if (((Object) ((restaurante) t).Estado.equals("funcional")) instanceof restaurante) {
                                                System.out.println(listaRe.indexOf(t) + "-" + t + "\n");
                                            }
                                            //}
                                        }
                                        break;
                                    case 2:
                                        for (Object t : listaRe) {
                                            //if (t instanceof restaurante) {
                                            if (((Object) ((restaurante) t).Estado.equals("remodelacion")) instanceof restaurante) {
                                                System.out.println(listaRe.indexOf(t) + "-" + t + "\n");
                                            }
                                            //}
                                        }
                                        break;
                                    case 3:
                                        for (Object t : listaRe) {
                                            //if (t instanceof restaurante) {
                                            if (((Object) ((restaurante) t).Estado.equals("demolicion")) instanceof restaurante) {
                                                System.out.println(listaRe.indexOf(t) + "-" + t + "\n");
                                            }
                                            //}
                                        }
                                        break;
                                    default:
                                        System.out.println("Opcion invalida");
                                        break;
                                }
                                break;
                            case 2:
                                for (Object t : listapre) {
                                    System.out.println(listapre.indexOf(t) + "-" + t + "\n");

                                }
                                break;
                            case 3:
                                System.out.println("Ingrese el nombre de la franquicia");
                                String fq = leer.next();
                                for (Object t : listaRe) {
                                    if (((restaurante) t).franquisia.equals(fq)) {
                                            System.out.println(listaRe.indexOf(t) + "-" + t + "\n");
                                        }
                                }
                                break;
                            case 4:
                                for (Object object : gerente) {
                                    System.out.println(listaRe.indexOf(object) + "-" + object + "\n");
                                }

                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("1.Crear\n2.Listar\n3.Modificar\n4.Eliminar");
                        int oc= leer.nextInt();
                        switch (oc) {
                            case 1:
                                System.out.println("Ingrese el nombre de la franquicia");
                                String franquicia = leer.next();
                                franquicia=franquicia.toLowerCase();
                                System.out.println("Nombre del restaurante");
                                String nr = leer.nextLine();
                                nr = nr.toLowerCase();
                                System.out.println("Ingrese la ubicacion");
                                String ub = leer.nextLine();
                                ub = ub.toLowerCase();
                                boolean flag=false,par,jg;
                                int i=0;
                                while(flag ==false||i<listaRe.size()){
                                    if (((restaurante)listaRe.get(i)).ubicacion.equals(ub)) {
                                        System.out.println("La ubicacion ya esta ocupada");
                                        System.out.println("Ingrese la nueva ubicacion");
                                        ub = leer.nextLine();
                                        flag=true;
                                    }
                                    i++;
                                }
                                System.out.println("Ingrese la cantidad de empleados");
                                int ne = leer.nextInt();
                                System.out.println("Tiene parqueo");
                                String rp = leer.next();
                                rp = rp.toLowerCase();
                                if (rp.equals("si")) {
                                    
                                }
                                
                                break;
                            case 2:
                                
                                break;
                            case 3:
                                break;
                            case 4:
                                for (Object o : listaRe) {
                                    System.out.println(listaRe.indexOf(o)+"-"+o+"\n");
                                }
                                System.out.println("Ingrese el numero que desea remover");
                                int remove = leer.nextInt();
                                listaRe.remove(remove);
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
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
            resp = leer.next().charAt(0);
        }
    }

}
