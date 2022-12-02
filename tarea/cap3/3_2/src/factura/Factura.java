
package factura;


    public class Factura{
    private String n; 
    private String des;
    private int can; 
    private double p; 
 
    
    public Factura( String num, String descri, int canti, double precio)
    { 
    
    this.n = num; 
    this.des = descri;
    
    if (canti > 0) 
        this.can = canti; 
    if (precio > 0.0)
        this.p = precio; 
    }

    
    public void obtenerMontoFactura(double montoFactura, int montoPrecio)
    {
    if (montoFactura > 0 && montoPrecio > 0.0) 
    p = montoFactura * montoPrecio;
    }
    
   
    public void establecerNumero(String num)
    {
    this.n = num;
    }

    public String obtenerNumero()
    {
    return n; 
    } 
    public void establecerDescripcion(String descri)
    {
    this.des = descri;
    }

    public String obtenerDescripcion()
    {
    return des; 
    }
    public void establecerCantidad(int canti)
    {
    this.can = canti;
    }

    public int obtenerCantidad()
    {
    return can; 
    } 
   
    public void establecerPrecio(double precio)
    {
    this.p = precio;
    }

    public double obtenerPrecio()
    {
    return p;
    }
    
} 