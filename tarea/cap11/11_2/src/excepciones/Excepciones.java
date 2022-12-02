
package excepciones;


public class Excepciones {


    public static void main(String[] args) {
        String usuario, contraseña, confcontraseña;
        
        usuario= "STEPHA MACHAD";
        contraseña= "20022019";
        confcontraseña= "20022019";
        
        expecions h =new expecions();
        
        try{
            h.validarcontraseña(contraseña, confcontraseña);
            System.out.println("USUARIO REGISTRADO CON EXITO :)\n" );
            System.out.println("BIENVENIDO(A) "+usuario);
           
        }catch(ExcepcionA e){
          
           e.printStackTrace();
        } 
    }
}
