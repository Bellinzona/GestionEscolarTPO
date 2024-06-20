public class Alumno {

    private String nombre;
    private  int notas;

    private int faltas;

    private String estado;

    public Alumno(String nombre,int notas, int faltas){
        this.nombre = nombre;
        this.notas = notas;
        this.faltas = faltas;
    }


    public String getNombre() {
        return nombre;
    }

    public int getFaltas() {
        return faltas;
    }

    public int getNotas() {
        return notas;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
