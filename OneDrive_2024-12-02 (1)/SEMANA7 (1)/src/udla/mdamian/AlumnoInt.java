package udla.mdamian;

public class AlumnoInt extends Alumno{
    private String paisOrigen;

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public AlumnoInt(String nombre, String apellido, String paisOrigen) {
        super(nombre, apellido);
        this.paisOrigen = paisOrigen;
    }

    public AlumnoInt(String carrera, String paisOrigen) {
        super(carrera);
        this.paisOrigen = paisOrigen;
    }
}
