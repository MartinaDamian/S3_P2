package udla.MDamian.pooabsint.imprenta.modelo;

import java.util.List;

public class Libro{
    //implemente -> INTERFACE
    private List<Hoja> paginas;
    private Persona autor;
    private String titulo;
    private Genero genero;
    //ENUMERADORES

    public Libro(List<Hoja> paginas, Persona autor, String titulo, Genero genero) {
        this.paginas = paginas;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }
    public Libro addPagina(Hoja pagina){
        paginas.add(pagina);
        return this;
    }
    public String imprimir(){
        StringBuilder sb = new StringBuilder("Titulo: ");
        sb.append(this.titulo).append("\n")
                .append("Autor: ").append(this.autor).append("\n").

    }
}
