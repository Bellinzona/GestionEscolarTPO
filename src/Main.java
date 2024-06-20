//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Escuela escuela1 = new Escuela("Escuela de prueba");

        Curso Curso1 = new Curso(4,"4C TM");
        Curso Curso2 = new Curso(2,"2C TM");

        Materia matematicas = new Materia("Matematicas",87126,13);
        Materia Lengua = new Materia("Lengua",12223,16);
        Materia EducacionFisica = new Materia("EducacionFisica",3421,18);

        Preceptor preceptor1 = new Preceptor("Julian alvarez", 123424,"as");
        Preceptor preceptor2 = new Preceptor("Esteban quito", 123424,"as");
        Preceptor preceptor3 = new Preceptor("Santiago Incali", 123424,"as");
        Preceptor preceptor4 = new Preceptor("Franco Caarro", 123424,"as");

        Profesor profesor1 = new Profesor("Matematicas", "Elian Mamani", 2321);
        Profesor profesor2 = new Profesor("Lengua", "Ana Martinez", 5678);
        Profesor profesor3 = new Profesor("EducacionFisica", "Pablo Lopez", 9876);
        Profesor profesor4 = new Profesor("Historia", "Carlos Sanchez", 1234);


        Alumno alumno1 = new Alumno("Mateo Bellinzona", 18, 80);
        Alumno alumno2 = new Alumno("Agustin Echeverria", 19, 75);
        Alumno alumno3 = new Alumno("Renata Mendez", 20, 85);
        Alumno alumno4 = new Alumno("Joaquin Romero", 21, 90);
        Alumno alumno5 = new Alumno("Camila Suarez", 22, 95);
        Alumno alumno6 = new Alumno("Lucas Sosa", 23, 85);
        Alumno alumno7 = new Alumno("Valentina Lopez", 24, 88);
        Alumno alumno8 = new Alumno("Matias Pereyra", 25, 92);
        Alumno alumno9 = new Alumno("Sofia Fernandez", 26, 78);
        Alumno alumno10 = new Alumno("Nicolas Gomez", 27, 82);
        Alumno alumno11 = new Alumno("Isabella Torres", 28, 87);
        Alumno alumno12 = new Alumno("Facundo Ramirez", 29, 89);
        Alumno alumno13 = new Alumno("Valeria Acosta", 30, 93);
        Alumno alumno14 = new Alumno("Juan Martin Castro", 31, 94);
        Alumno alumno15 = new Alumno("Catalina Chavez", 32, 91);
        Alumno alumno16 = new Alumno("Maximiliano Rios", 33, 84);
        Alumno alumno17 = new Alumno("Luna Fernandez", 34, 79);
        Alumno alumno18 = new Alumno("Benjamin Medina", 35, 83);
        Alumno alumno19 = new Alumno("Renzo Morales", 36, 86);
        Alumno alumno20 = new Alumno("Valentina Rodriguez", 37, 88);



        // -------------------- se agregan los cursos a la escuela ---------------------
        escuela1.agregarCurso(Curso1);
        escuela1.agregarCurso(Curso2);

        System.out.println();

        // -------------------- se agregan las materias a los cursos ---------------------
        Curso1.agregarMateria(matematicas);
        Curso1.agregarMateria(Lengua);

        Curso2.agregarMateria(EducacionFisica);
        Curso2.agregarMateria(Lengua);
        System.out.println();

        // -------------------- se agregan los Profesores a las Materias ---------------------

        matematicas.agregarProfesor(profesor1);
        Lengua.agregarProfesor(profesor2);
        Lengua.agregarProfesor(profesor3);
        EducacionFisica.agregarProfesor(profesor4);






        // -------------------- se agregan los almunos a los cursos ---------------------

        Curso1.agregarAlumno(alumno1);
        Curso1.agregarAlumno(alumno2);
        Curso1.agregarAlumno(alumno3);
        Curso1.agregarAlumno(alumno4);
        Curso1.agregarAlumno(alumno5);
        Curso1.agregarAlumno(alumno6);
        Curso1.agregarAlumno(alumno7);
        Curso1.agregarPreceptor(preceptor1);
        Curso1.agregarPreceptor(preceptor2);
        System.out.println();

        Curso2.agregarAlumno(alumno8);
        Curso2.agregarAlumno(alumno9);
        Curso2.agregarAlumno(alumno10);
        Curso2.agregarAlumno(alumno11);
        Curso2.agregarAlumno(alumno12);
        Curso2.agregarAlumno(alumno13);
        Curso2.agregarAlumno(alumno14);
        Curso2.agregarAlumno(alumno15);
        Curso2.agregarAlumno(alumno16);
        Curso2.agregarAlumno(alumno17);
        Curso2.agregarAlumno(alumno18);
        Curso2.agregarAlumno(alumno19);
        Curso2.agregarAlumno(alumno20);
        Curso2.agregarPreceptor(preceptor3);
        Curso2.agregarPreceptor(preceptor4);
        System.out.println();

        // -------------------- METODOS ---------------------
        System.out.println("-------------------- METODOS ---------------------");

        escuela1.mostrarCursos();
        System.out.println();

        Curso1.getTurno();

        System.out.println();

        Curso1.getGrado();

        System.out.println();

        Curso1.mostrarMaterias();

        System.out.println();
        Curso1.mostrarPreceptores();


        System.out.println();
        Curso1.mostrarAlumnos();

        System.out.println();


        Curso2.getTurno();

        System.out.println();
        Curso2.getGrado();

        System.out.println();
        Curso2.mostrarMaterias();

        System.out.println();
        Curso2.mostrarPreceptores();

        System.out.println();
        Curso2.mostrarAlumnos();










    }
}