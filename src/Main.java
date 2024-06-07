//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Escuela escuela1 = new Escuela("EEA");

        Curso asda = new Curso(4,"4C TM");
        Curso asdaasa = new Curso(2,"2C TM");

        Materia matematicas = new Materia("Matematicas",87126,16);

        escuela1.agregarCurso(asda);
        escuela1.agregarCurso(asdaasa);

        asda.agregarMateria(matematicas);

        escuela1.mostrarCursos();
        asda.mostrarMaterias();



    }
}