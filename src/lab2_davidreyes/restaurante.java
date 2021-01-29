package lab2_davidreyes;

public class restaurante {
    String franquisia;
    String name;
    String ubicacion;
    int empleados;
    boolean parqueo;
    boolean areaj;
    int mesas;
    int cajeros;
    String gerente;
    String especialidad;
    String Estado;

    public restaurante() {
    }

    public restaurante(String franquisia, String name, String ubicacion, int empleados, boolean parqueo, boolean areaj,int mesas, int cajeros, String gerente, String especialidad, String Estado) {
        this.franquisia = franquisia;
        this.name = name;
        this.ubicacion = ubicacion;
        this.empleados = empleados;
        this.parqueo = parqueo;
        this.areaj = areaj;
        this.mesas = mesas;
        this.cajeros = cajeros;
        this.gerente = gerente;
        this.especialidad = especialidad;
        this.Estado = Estado;
    }

    public restaurante(String gerente) {
        this.gerente = gerente;
    }
    

    public String getFranquisia() {
        return franquisia;
    }

    public void setFranquisia(String franquisia) {
        this.franquisia = franquisia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public boolean isParqueo() {
        return parqueo;
    }

    public void setParqueo(boolean parqueo) {
        this.parqueo = parqueo;
    }

    public boolean isAreaj() {
        return areaj;
    }

    public void setAreaj(boolean areaj) {
        this.areaj = areaj;
    }

    public int getMesas() {
        return mesas;
    }

    public void setMesas(int mesas) {
        this.mesas = mesas;
    }

    public int getCajeros() {
        return cajeros;
    }

    public void setCajeros(int cajeros) {
        this.cajeros = cajeros;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        if(!Estado.equals("Remodelación")||!Estado.equals("Demolicion")){
        return "restaurante\n" + "franquisia=" + franquisia + ", name=" + name + ", ubicacion=" + ubicacion + ", empleados=" + empleados + ", parqueo=" + parqueo + ", areaj=" + areaj + ", mesas=" + mesas + ", cajeros=" + cajeros + ", gerente=" + gerente + ", especialidad=" + especialidad + ", Estado=" + Estado ;
        }else{
            return "restaurante\n" + "franquisia=" + franquisia + ", name=" + name + ", ubicacion=" + ubicacion + ", empleados=" + empleados + ", parqueo=" + parqueo + ", areaj=" + areaj + ", mesas=" + "No tiene "+ ", cajeros=" + cajeros + ", gerente=" + "No tiene" + ", especialidad=" + "No tiene" + ", Estado=" + Estado ;
        }
        }
    public String toStringG() {
        
            return "Nombre del gerente: " + gerente;
        }
}
