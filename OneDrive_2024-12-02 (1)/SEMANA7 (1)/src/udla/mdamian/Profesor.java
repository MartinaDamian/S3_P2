package udla.mdamian;

public class Profesor extends Persona{
    private String materia;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Profesor(String nombre, String apellido, String materia) {
        super(nombre, apellido);
        this.materia = materia;
    }
}
