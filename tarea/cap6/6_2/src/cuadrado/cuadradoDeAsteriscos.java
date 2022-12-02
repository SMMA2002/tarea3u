
package cuadrado;

public class cuadradoDeAsteriscos {
    
    public void obtenerCuadrado(int numeroLado)
    {
        if (numeroLado > 1 ){
            for (int a = 1; a <= numeroLado; a++){
                for (int b = 1; b <= numeroLado; b++){
                    System.out.print("*");
                }
            System.out.println();
            }
        }
    }
}
