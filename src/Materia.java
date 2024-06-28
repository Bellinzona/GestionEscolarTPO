import java.util.HashSet;

public class Materia {

    private String nombreMateria;

    private int codigo;

    private int horario;

    HashSet<Profesor> profesores = new HashSet<>();

    public Materia(String nombreMateria,int codigo,int horario){
        this.nombreMateria = nombreMateria;
        this.codigo = codigo;
        this.horario = horario;
    }

    public String getNombreMateria(){
        return nombreMateria;
    }


    public void agregarProfesor(Profesor profesor){
        profesores.add(profesor);
        System.out.println("Se añadio " + profesor.getNombre() + " Como Profesor");
    }

    public HashSet mostrarProfesores(){
        return profesores;
    }

}

