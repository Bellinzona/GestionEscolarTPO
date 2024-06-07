package genteCargo;

public class Profesor {
    private String especialidad;
    private String nombre;

    private int legajo;

    public String getNombre() {
        return nombre;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String mostrarMateria(String especialidad) {
        return especialidad;
    }
    public Profesor (String especialidad, String nombre, int legajo){
        this.nombre= nombre;
        this.especialidad=especialidad;
        this.legajo=legajo;
    }
}
