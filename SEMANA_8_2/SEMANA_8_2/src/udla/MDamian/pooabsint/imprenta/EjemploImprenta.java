package udla.MDamian.pooabsint.imprenta;

import udla.MDamian.pooabsint.imprenta.modelo.Curriculo;
import udla.MDamian.pooabsint.imprenta.modelo.Hoja;
import udla.MDamian.pooabsint.imprenta.modelo.Informe;

//INERFACE
// no me permite generar aributos
//Unicamente se puede poseer metodos abstractos
//No poseen herencia
//Solo entre interfaces hay herencia(metodos)

//ABSTRCTA
//Los metodos no son implementados, cada implementacion en las clases pueden ser distintas
//No sepuede instanciar

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv= new Curriculo("Juan Galan", "Ing de software", ".");
        cv.experiencia("Java");
        cv.experiencia("Oracle DBA");
        cv.experiencia("SpringBoot Framework");
        cv.experiencia("Desarrollador FullStank");
        cv.experiencia("Angular");
        Informe informe = new Informe("Autor: JJJ", "Revisor: KK", "Contenido: Estudio Microservicios");
        imprimir(cv);
        imprimir(informe);
    }
        public static void imprimir(Hoja imprime){
            System.out.println(imprime.imprimir());
        }

}
