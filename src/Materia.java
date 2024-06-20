import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Materia {

    String nombreMateria;

    int codigo;

    int horario;

    ArrayList<Profesor> listaProfesores = new ArrayList<>();

    public Materia(String nombreMateria,int codigo,int horario){
        this.nombreMateria = nombreMateria;
        this.codigo = codigo;
        this.horario = horario;
    }

    public String getNombreMateria(){
        return nombreMateria;
    }


    public void agregarProfesor(Profesor profesor){
        listaProfesores.add(profesor);
        System.out.println("Se añadio " + profesor.getNombre() + " Como Profesor");
    }

    public void MostrarProfesores(){
        System.out.println("");
        for (Profesor profesor : listaProfesores){
            System.out.println(profesor.getNombre());
        }
    }


}

