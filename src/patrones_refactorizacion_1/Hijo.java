
package patrones_refactorizacion_1;

/* 
Pull up:
    Pasar metodos / atributos del hijo al padre es importante hacer q hereden antes de aplicar el refactor
*/

public class Hijo extends Padre{

    String apellido = "Badenas";
    
    public Hijo(){}

    public void mostrarapellido() {
        System.out.println(this.apellido);
    }

    
    /*Este metodo lo he pasado del padre al hijo con el push down*/
    public void mostraredad() {
        System.out.println(this.edad);
    }
    
    
}
