
package patrones_refactorizacion_1;

/*
Refactor parametros:
    Primero tengo q tener creado un metodo con distintas variables. Este refactor cambia la varaible y la pasa como entrada del metodo.
    Seleccionar las variables del metodo a refactorizar
*/

public class Refactor_parametos {

    int solucion;
    int resta;

    /*Antes del refactor*/
    public int resta(){
        solucion = resta - resta;
        return solucion;
    }
    
    /*Despues del refactor*/
    public int resta(int resta1, int resta2){
        solucion = resta1 - resta2;
        return solucion;
    }
}
