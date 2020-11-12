package arreglopils;
import java.util.Scanner;
public class ArregloPIls {
    
     public static void main(String[] args) {
     Pila lis = new Pila();  
     int opc2=0;
     int opc;
     Scanner lector = new Scanner(System.in);
       do{ 
        System.out.println("\n-------Menu------");
        System.out.println("1. Insertar dato");
        System.out.println("2. Leer lista");
        System.out.println("4. Borrar elemento de la lista o lista completa");
        System.out.println("5. Salir del programa");
        System.out.println("¿Que desea realizar?");
        opc=lector.nextInt();
        switch(opc){
            case 1:
            String elemento;
            Scanner Lector = new Scanner(System.in);
            System.out.println("inserte un elemento ");
            elemento=Lector.nextLine();
            lis.insertar(elemento);
            break;
            case 2:
                lis.mostrar();
                break;
            case 3:lis.eliminar();break;
            case 5: System.exit(0);break;
            default:System.out.println("No existe esa opcion, por favor intente de nuevo");
        }
        
          System.out.println("\n¿Desea realizar otro proceso? presione 1=SI    2=NO");
       opc2=lector.nextInt();
       }while(opc2!=2); 
    }
}

    
