package excepciones;

public class expecions {
    expecions(){   
    }
    
    public void validarcontraseña(String contraseña, String confcontraseña) throws ExcepcionA{
     
        if(contraseña.equals(confcontraseña)==false){
        
            throw new ExcepcionA("No coinciden");
        }
        if(contraseña.length()<8){
            
            throw new ExcepcionA("Debe ingresar 8 caracteres como minimo");
        }

    }
}
