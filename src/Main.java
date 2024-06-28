//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Escuela escuela1 = new Escuela("Escuela de prueba");

        Curso Curso1 = new Curso(4,"C TM");
        Curso Curso2 = new Curso(2,"C TM");

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


        Alumno alumno1 = new Alumno("Mateo Bellinzona", 18,  "Egresado");
        Alumno alumno2 = new Alumno("Agustin Echeverria", 19,  "Egresado");
        Alumno alumno3 = new Alumno("Renata Mendez", 20,  "Egresado");
        Alumno alumno4 = new Alumno("Joaquin Romero", 21, "Egresado");
        Alumno alumno5 = new Alumno("Camila Suarez", 22, "Egresado");
        Alumno alumno6 = new Alumno("Lucas Sosa", 23,  "Egresado");
        Alumno alumno7 = new Alumno("Valentina Lopez", 24,  "Egresado");
        Alumno alumno8 = new Alumno("Matias Pereyra", 25, "Egresado");


        alumno1.setEstado("Ingresante");



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

        Curso2.agregarPreceptor(preceptor3);
        Curso2.agregarPreceptor(preceptor4);
        System.out.println();
        // -------------------- se agregan las notas a los alumnos ---------------------

        alumno1.setNota(matematicas, 7);



        // -------------------- METODOS ---------------------
        System.out.println("-------------------- METODOS ---------------------");

        escuela1.mostrarCursos();
        System.out.println();


        System.out.println("-------------------- CURSO 1 ---------------------");

        System.out.println();
        Curso1.mostrarMaterias();

        System.out.println();
        Curso1.mostrarPreceptores();

        System.out.println();
        Curso1.mostrarAlumnos();
        System.out.println();

        System.out.println("-------------------- CURSO 2 ---------------------");

        System.out.println();
        Curso2.mostrarMaterias();

        System.out.println();
        Curso2.mostrarPreceptores();

        System.out.println();
        Curso2.mostrarAlumnos();

    }
}