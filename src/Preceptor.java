public class Preceptor {
    private String nombre;

    private int legajo;
    private String tarea;


    public Preceptor(String nombre, int legajo, String tarea){
        this.nombre=nombre;
        this.legajo=legajo;
        this.tarea=tarea;

    }

    public String getNombre() {
        return nombre;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public String mostrarTreaAsignada(String tarea){
        return tarea;
    }

}
