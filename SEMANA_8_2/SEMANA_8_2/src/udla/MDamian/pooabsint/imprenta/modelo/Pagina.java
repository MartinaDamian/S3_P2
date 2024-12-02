package udla.MDamian.pooabsint.imprenta.modelo;

public class Pagina extends Hoja{
    //Constructor
    public Pagina(String contenido) {
        super(contenido);
    }
    //Metodo abstracto
    @Override
    public String imprimir() {
        return this.contenido;
    }
}
