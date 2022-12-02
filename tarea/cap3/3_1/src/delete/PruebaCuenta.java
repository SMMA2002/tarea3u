
package delete;

import java.util.Scanner;

public class PruebaCuenta {

    
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Cuenta 1", 50.00);
        Cuenta cuenta2 = new Cuenta("Cuenta 2", -7.53);

        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);

        Scanner entrada = new Scanner(System.in);
        System.out.printf("%n");
        System.out.print("Escriba la cantidad a depositar para cuenta 1: ");
        double montoDeposito = entrada.nextDouble(); 
        System.out.printf("%nsumando %.2f al saldo de cuenta 1%n%n",
        montoDeposito);
        cuenta1.depositar(montoDeposito); 
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);
        
        System.out.print("Escriba la cantidad a depositar para cuenta 2: "); 
        montoDeposito = entrada.nextDouble();
        System.out.printf("%nsumando %.2f al saldo de cuenta 2%n%n",
        montoDeposito);
        cuenta2.depositar(montoDeposito); 

       
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);
        
        } 
    public static void mostrarCuenta(Cuenta cuentaAMostrar){
        System.out.printf("Saldo de %s: $%.2f%n",cuentaAMostrar.obtenerNombre(), cuentaAMostrar.obtenerSaldo()); 
        cuentaAMostrar.obtenerSaldo();
        
    }
    
 } 
