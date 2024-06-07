import java.util.ArrayList;

public class Escuela {

     String nombre;
     ArrayList<Curso> listaCurso = new ArrayList<>();

     public Escuela(String nombreEscuela){
          this.nombre = nombreEscuela;

     }

     public void agregarCurso(Curso cursoAgregar){

          listaCurso.add(cursoAgregar);
          System.out.println("se agrego");

     }

     public void mostrarCursos(){
          for (Curso curso : listaCurso ){
               System.out.println(curso.getTurno());


          }

     }


}
