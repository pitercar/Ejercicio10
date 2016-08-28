/*
Leer un número de dos dígitos y determinar si pertenece a la serie de Fibonacci.
 */
package ejercicio10;
import java.util.*;

/**
 *
 * @author Piter
 */
public class Ejercicio10 {
    
    private int numero;
    
    public void cargarDatos(){
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Digite un numero entre 10 y 99... ");
        numero=entrada.nextInt();
    }
    
    public void comparaNumero(){
        
        System.out.println("El numero digitado fue el "+numero);
        
        if (numero==13 || numero==21 || numero==34 || numero== 55 || numero== 89){
        	
            System.out.println("El número " + numero + "  si pertenece a la sucesión de Fibonacci");
         }
                
        else {
        	
            System.out.println("El número " + numero + "  no pertenece a la sucesión de Fibonacci");
        }
    }
}
