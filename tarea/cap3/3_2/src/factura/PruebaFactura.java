
package factura;


import java.util.Scanner;

public class PruebaFactura {

   
    public static void main(String[] args) {
        Factura factu =new Factura("01", "Cliente", 0, -7.53);

        
        mostrarCuenta(factu);

       
        Scanner entrada = new Scanner(System.in);

        System.out.print("Cantidad de Productos: "); 
        double montoFactura = entrada.nextDouble(); 
        System.out.print("Precio por unidad: "); 
        double montoPrecio = entrada.nextInt(); 
        factu.obtenerMontoFactura(montoFactura, (int) montoPrecio);

    
        mostrarCuenta(factu);
        } 
        public static void mostrarCuenta(Factura cuentaAMostrar){
            System.out.printf("total a pagar %s: $%.2f%n",cuentaAMostrar.obtenerDescripcion(), cuentaAMostrar.obtenerPrecio()); 
            cuentaAMostrar.obtenerPrecio();
           
        }
    
 } 
