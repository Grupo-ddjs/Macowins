import java.util.List; // import just the List interface
import java.util.ArrayList; // import just the ArrayList class
import java.util.Collection;
 public class Efectivo{
     
    public double precioFinal(List prendas)
    {
         return this.precio(prendas);
    }
    
    public double precio(List prendas)
    {
        return prendas.stream().map(prenda -> prenda.precioFinal()).sum();
    }
 }