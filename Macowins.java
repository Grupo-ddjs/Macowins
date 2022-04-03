import java.time.*;
import java.util.List; // import just the List interface
import java.util.ArrayList; // import just the ArrayList class

public class Macowins{
    private List ventas = new ArrayList();
    
    public Double GananciasDeUnDeterminadoDia(LocalDate dia)
    {
        return  ventas.stream().filter(venta -> venta.diaRealizada() == dia)
        .map(venta -> venta.precioVenta()).sum();
    }
 }