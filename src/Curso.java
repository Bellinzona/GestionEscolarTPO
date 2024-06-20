import java.util.ArrayList;

public class Curso {

    private int grado;

    private String turno;
    private ArrayList<Materia> listaMaterias = new ArrayList<>();

    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    private ArrayList<Preceptor> listaPreceptores = new ArrayList<>();


    public Curso(int grado, String Turno){
        this.grado = grado;
        this.turno = Turno;

    }


    public void getGrado(){
        System.out.println(grado);
    }

    public void agregarMateria(Materia materia){
        listaMaterias.add(materia);
        System.out.println("se añadio " + materia.getNombreMateria() +  " como Materia");


    }

    public void agregarAlumno(Alumno alumno){
        listaAlumnos.add(alumno);
        System.out.println("se añadio " + alumno.getNombre() + " Como alumno");
    }

    public void agregarPreceptor(Preceptor Preceptor){
        listaPreceptores.add(Preceptor);
        System.out.println("se añadio " + Preceptor.getNombre() + " Como Preceptor");

    }

    public String getTurno(){
        return turno;
    }

    public void mostrarMaterias() {
        System.out.println("Materias: ");
        for (Materia materia : listaMaterias) {
            System.out.print(materia.getNombreMateria() + ": ");  // Imprime el nombre de la materia seguido de los profesores
            materia.MostrarProfesores();  // Imprime la lista de profesores asociados a la materia
        }
    }


    public void mostrarAlumnos(){
        System.out.println("Alumnos: ");
        for (Alumno alumno : listaAlumnos){
            System.out.println(alumno.getNombre());
        }
    }


    public void mostrarPreceptores(){
        System.out.println("Preceptores: ");
        for (Preceptor preceptor : listaPreceptores){
            System.out.println(preceptor.getNombre());
        }
    }






}
