public class Promocion implements Estado{
    private double cantidadARestarDelPrecioBase;
    
    Promocion (double cantidadARestarDelPrecioBase)
    {
        this.cantidadARestarDelPrecioBase = cantidadARestarDelPrecioBase;
    }
    
     public double precio(double precioBase){
         return precioBase - this.cantidadARestarDelPrecioBase;
     } 
 }