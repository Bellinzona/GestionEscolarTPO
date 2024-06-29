import java.util.ArrayList;

public class Alumno {

    private String nombre;
    private ArrayList<Calificaciones> notas = new ArrayList<>();

    private int faltas;

    private String estado;

    public Alumno(String nombre, int faltas, String estado) {
        this.nombre = nombre;
        this.faltas = faltas;
        this.estado = estado;
    }


    public String getNombre() {
        return nombre;
    }

    public int getFaltas() {
        return faltas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNota(Materia matematicas, int nota) {
        Calificaciones calificacion = new Calificaciones(matematicas, nota);
        notas.add(calificacion);
    }

    public void mostrarNotas() {
        System.out.println("Notas de " + nombre + ":");
        for (Calificaciones calificacion : notas) {
            System.out.println(calificacion);
        }

    }
}