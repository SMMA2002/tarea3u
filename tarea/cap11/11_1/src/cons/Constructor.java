
package cons;

/**
 *
 * @author Lenovo
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Constructor {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("\n--------DIVISION--------\n\n");
        try{
            int numerador, denominador, resultado;

            System.out.print("INGRESE EL NUMERADOR: ");
            numerador=sc.nextInt();

            System.out.print("INGRESE EL DENOMINADOR: ");
            denominador=sc.nextInt();

            resultado= numerador / denominador;

            System.out.println(+numerador+" / "+denominador+" = "+resultado);
            System.out.println("\n ------------------------------------------------\n\n");
        }catch(InputMismatchException inputMismatchException){
    
        System.out.println("DEBE INGRESAR UN NUMERO ENTERO\n INTENTE DE NUEVO");
        
        }catch(ArithmeticException Ex){
            System.out.println("\n");
            System.out.println("OPERACION INVALIDA, NO SE PUEDE DIVIDIR ENTRE CERO \n");
            System.out.println("INTENTE DE NUEVO");
            System.out.println("\n ------------------------------------------------\n\n");
        
        }
     }
}
