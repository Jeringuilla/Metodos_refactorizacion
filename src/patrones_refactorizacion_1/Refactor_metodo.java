
package patrones_refactorizacion_1;

/*
Refactor introduce method:
    Crear nuevos metodos a partir de otros
*/

public class Refactor_metodo {
    
    int numero;
    int solucion;
    String texto = "Refactor Introduce Method";
    
    public void texto(){
        mostrar_texto();
    }

    /*Creada normal */ 
    public void mostrar_texto() {
        System.out.println(texto);
    }

    /*Creada con refactor llama al metodo mostrar_suma creando un nuevo metodo llamado suma por lo que para mostrar
    la solucion llamo a este metodo
    */ 
    public void suma() {
        mostrar_suma();
    }

    /*Creada normal */ 
    public void mostrar_suma() {
        solucion = numero + numero;
        System.out.println(solucion);
    }
    
}
