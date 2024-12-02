package udla.MDamian.pooabsint.imprenta.modelo;

abstract public class Hoja {
    protected String contenido;
    public Hoja(String contenido) {
        this.contenido = contenido;
    }
    abstract public String imprimir(); //metodo en la clase abstracta no se escribe el cuerpo
    //Una clase abstracta puede tener o no metodos abstractos
    // Un metodo abstracto se crea en una clase abstracto

}
