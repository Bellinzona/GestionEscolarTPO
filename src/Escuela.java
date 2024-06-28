import java.util.ArrayList;

public class Escuela {

    private String nombre;
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Escuela(String nombreEscuela){
        this.nombre = nombreEscuela;

    }

    public void agregarCurso(Curso cursoAgregar){

        cursos.add(cursoAgregar);
        System.out.println("se agrego");

    }

    public ArrayList mostrarCursos(){
        return cursos;

    }



}
