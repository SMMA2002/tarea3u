
package conversiones_de_temperatura;

import java.util.Scanner;

public class Conversiones {

    public static void main(String[] args) {
       Metodos metodo = new Metodos();
       
       Scanner entrada = new Scanner(System.in);
        
       System.out.print("1. De Fahrenheit a Centigrados \n");
       System.out.print("2. De Centigrados a Fahrenheit \n");
       System.out.print("Opcion : ");
       int numero = entrada.nextInt();
       
       switch (numero){
            case 1:
                System.out.print("Grados Fahrenheit (F) : ");
                int mostrarGrado1 = entrada.nextInt();
                metodo.Centigrados(mostrarGrado1);
            break;
            
            case 2:
                System.out.print("Grados Centigrados (C): ");
                int mostrarGrado2 = entrada.nextInt();
                metodo.Fahrenheit(mostrarGrado2);
            break;
            
            default:
                System.out.print("La opcion no era valida \n");
            break;
        }
    }
    
}
