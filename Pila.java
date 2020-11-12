package arreglopils;
    public class Pila {
    int inicio;
    String[] pila;
    int max;

    public Pila() {
        inicio=-1;
        pila=new String[5];
    }
    public void insertar(String elemento){
        //Inserta un elemento en la Pila
        if(inicio==4){
        System.out.println("Pila llena, Ya no se puede insertar datps");
        }
        else{
        pila[++inicio]=elemento;
        System.out.println("Se inserto el elemento");}
    }

     public void eliminar(){
      String aux;
       //Elimina el elemento ultimo de la Pila
        if(inicio==-1){
            System.out.println("Pila vacia");
        }
        else{
        aux=pila[inicio];
        inicio--;
         System.out.println("Se elimino el elemento");}
    }
    
    public void mostrar(){
        if(inicio==-1){
            System.out.println("Pila vacia");
        }
        else{
        for (int i=inicio; i>=0; i--){
         System.out.println(pila[i]);
        }}
    }
    
    
    }
    
