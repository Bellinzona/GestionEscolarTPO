public class Calificaciones {
    private Materia materia;
    private int nota;

    public Calificaciones(Materia materia, int nota) {
        this.materia = materia;
        this.nota = nota;
    }

    public Materia getMateria() {
        return materia;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Materia: " + materia.getNombreMateria() + ", Nota: " + nota;
    }
}

