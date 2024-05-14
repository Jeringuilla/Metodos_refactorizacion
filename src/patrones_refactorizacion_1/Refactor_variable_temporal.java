
package patrones_refactorizacion_1;

/*Refactor varible temporal:
    Obtener un nueva variable
*/

public class Refactor_variable_temporal {
    int numero;
    int solucion;
    
    public Refactor_variable_temporal(){}
    
    public void suma_antesRefactor(){
        solucion = numero + numero;
        System.out.println(solucion);
    }
    
    /*He creado la variable total refactorizando numero + numero*/
    public void suma_despuesRefactor(){
        final int total = numero + numero;
        System.out.println("La suma es " + total); 
    }
}
