import java.util.ArrayList;

import java.util.ArrayList;

public class Curso {
    private int grado;
    private String turno;
    private ArrayList<Materia> materias = new ArrayList<>();
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    private ArrayList<Preceptor> preceptores = new ArrayList<>();

    public Curso(int grado, String turno) {
        this.grado = grado;
        this.turno = turno;
    }

    public int getGrado() {
        return grado;
    }

    public String getTurno() {
        return turno;
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
        System.out.println("Se añadió " + materia.getNombreMateria() + " como Materia");
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
        System.out.println("Se añadió " + alumno.getNombre() + " como Alumno");
    }

    public void agregarPreceptor(Preceptor preceptor) {
        preceptores.add(preceptor);
        System.out.println("Se añadió " + preceptor.getNombre() + " como Preceptor");
    }

    public void mostrarMaterias() {
        System.out.println("Materias en el curso " + grado + turno + ":");
        for (Materia materia : materias) {
            System.out.println(materia.getNombreMateria());
        }
    }

    public void mostrarAlumnos() {
        System.out.println("Alumnos en el curso " + grado + turno + ":");
        for (Alumno alumno : alumnos) {
            System.out.print(alumno.getNombre()+ " ");
            System.out.print(alumno.getFaltas()+ " ");
            System.out.println(alumno.getEstado());
        }
    }

    public void mostrarPreceptores() {
        System.out.println("Preceptores en el curso " + grado + turno + ":");
        for (Preceptor preceptor : preceptores) {
            System.out.println(preceptor.getNombre());
        }
    }
    public void mostrarNotasAlumno(String nombreAlumno) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
                alumno.mostrarNotas();
                return;
            }
        }
        System.out.println("Alumno " + nombreAlumno + " no encontrado en el curso " + grado + " " + turno);
    }
}
