
package cuadrado;

import java.util.Scanner;

public class Cuadrado {

    public static void main(String[] args) {
        cuadradoDeAsteriscos cuadro = new cuadradoDeAsteriscos();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el magnitud del cuadrado: ");
        int mostrarLado = entrada.nextInt();
        cuadro.obtenerCuadrado((int) mostrarLado);
    }
    
}
