import java.util.ArrayList;

public class Curso {

    int grado;

    String turno;
    ArrayList<Materia> listaMaterias = new ArrayList<>();


    public Curso(int grado, String Turno){
        this.grado = grado;
        this.turno = Turno;

    }


    public void getGrado(){
        System.out.println(grado);
    }

    public void agregarMateria(Materia materia){
        listaMaterias.add(materia);
        System.out.println("se añadio");


    }

    public String getTurno(){
        return turno;
    }

    public void mostrarMaterias(){
        for (Materia materia : listaMaterias){
            System.out.println(materia.getNombreMateria());

        }

    }





}
