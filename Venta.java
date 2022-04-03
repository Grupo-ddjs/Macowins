 import java.time.*;
import java.util.List; // import just the List interface
import java.util.ArrayList; // import just the ArrayList class

 public class Venta{
    private LocalDate diaRealizada;
    private List prendas = new ArrayList();
    private Efectivo tipoDeVenta;
    
    Venta(LocalDate diaRealizada , List prendas , Efectivo tipoDeVenta){
        this.diaRealizada = diaRealizada;
        this.prendas = prendas;
        this.tipoDeVenta = tipoDeVenta;
    }
    
    public double precioVenta(){
        return tipoDeVenta.precioFinal(prendas);
    }
    
    public int cantidadDePrendasVendidas()
    {
        return prendas.size();
    }
    
    public LocalDate diaRealizada(){
        return this.diaRealizada;
    }
 }