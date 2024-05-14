
package patrones_refactorizacion_1;

/*
Inline:
    Para llamar a una clase no es necesario crear un objeto de la clase. Se puede llamar directamente con esta forma de refactorizacion
*/

public class Inline {
    
    /*Antes de aplicar la refactorización creamos un metodo que pille la clase prueba*/
    public Prueba simetrico(){
        Prueba objeto_prueba = new Prueba();
        return objeto_prueba;
    }
    
    public Prueba simetrico_inline(){
        return new Prueba();
    }
}
