package udla.mdamian;

public class Alumno extends Persona{
    private String carrera;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

   /* public Alumno() {
    }*/
    public Alumno(String nombre, String apellido){
        super(nombre, apellido);
    }

}
