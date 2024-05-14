
package patrones_refactorizacion_1;

/*
Extract SuperClass:
    Con este refactor podemos crear una clase 'padre'. La clase padre se llamara NewClass
*/
public class ExtractClass extends NewClass {
    int numero;
    
    public ExtractClass(){}
    
    public void suma(){
        solucion = numero + numero;
        System.out.println(solucion );
    }
}
