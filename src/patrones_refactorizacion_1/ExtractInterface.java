
package patrones_refactorizacion_1;

/*
Extract Interface:
    Crea una clase interface con el metodo en este caso suma todas las clases que implementen la interfaz
    tendran que tener este metodo
*/

public class ExtractInterface implements NewInterface {
    int numero;
    int solucion;
    
    public ExtractInterface(){}
    
    @Override
    public void suma(){
        solucion = numero + numero;
        System.out.println(solucion);
    }
}
