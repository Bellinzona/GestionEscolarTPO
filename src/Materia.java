import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Materia {

    String nombreMateria;

    int codigo;

    int horario;

    public Materia(String nombreMateria,int codigo,int horario){
        this.nombreMateria = nombreMateria;
        this.codigo = codigo;
        this.horario = horario;
    }

    public String getNombreMateria(){
        return nombreMateria;
    }


}

