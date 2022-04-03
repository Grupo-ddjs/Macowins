 public class Prenda{
    private double precioBase;
    private Estado estado;
    
    Prenda(double precioBase , Estado estado)
    {
        this.precioBase = precioBase;
        this.estado = estado;
    }
    public double precioFinal(){
        return this.estado.precio(this.precioBase);
    }
 }