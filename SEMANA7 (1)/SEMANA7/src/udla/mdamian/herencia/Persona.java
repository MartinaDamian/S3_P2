package udla.mdamian.herencia;

public class Persona {
    //forma 1
    /*protected String nombre;
    protected String apellido;
    protected int edad;
    protected String correo;*/
    //forma 2
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
