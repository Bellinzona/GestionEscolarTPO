public class Profesor {
    private String especialidad;
    private String nombre;

    private int legajo;

    public Profesor (String especialidad, String nombre, int legajo){
        this.nombre= nombre;
        this.especialidad=especialidad;
        this.legajo=legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public String mostrarMateria(String especialidad) {
        return especialidad;
    }

}
