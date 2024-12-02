package udla.MDamian.pooabsint.imprenta.modelo;

public class Informe extends Hoja{
    //Cuando yo heredo una clase abstracta se necesita sus propios metodos de acuerdo a los metodos abstractos
    private String autor;
    private String revisor;

    public Informe(String autor, String revisor, String contenido) {
        super(contenido);
        this.autor= autor;
        this.revisor= revisor;
    }

    @Override// Aplicacion de polimorfismo
    public String imprimir() {
        return "Informe escrito por : " + this.autor
                + "Revisado por : " + this.revisor
                + "\n" + this.contenido;
    }
}
