import java.util.ArrayList;

public class Curso {

    private int grado;

    private String turno;
    private ArrayList<Materia> materias = new ArrayList<>();

    private ArrayList<Alumno> alumnos = new ArrayList<>();

    private ArrayList<Preceptor> preceptors = new ArrayList<>();


    public Curso(int grado, String Turno){
        this.grado = grado;
        this.turno = Turno;

    }


    public int getGrado(){
        return grado;
    }

    public void agregarMateria(Materia materia){
        materias.add(materia);
        System.out.println("se añadio " + materia.getNombreMateria() +  " como Materia");


    }

    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
        System.out.println("se añadio " + alumno.getNombre() + " Como alumno");
    }

    public void agregarPreceptor(Preceptor Preceptor){
        preceptors.add(Preceptor);
        System.out.println("se añadio " + Preceptor.getNombre() + " Como Preceptor");

    }

    public String getTurno(){
        return turno;
    }

    public ArrayList mostrarMaterias() {
        return materias;
    }


    public ArrayList mostrarAlumnos(){
        return alumnos;
    }


    public ArrayList mostrarPreceptores(){
        return preceptors;

    }






}
