import java.util.List; // import just the List interface
import java.util.ArrayList; // import just the ArrayList class

 public class Tarjeta extends Efectivo{
    private int cuotas;
    private double coeficienteFijo;
    Tarjeta(int cuotas , double coeficienteFijo){
        this.cuotas = cuotas;
        this.coeficienteFijo = coeficienteFijo;
    }
    public double precioFinal(List prendas)
    {
        return this.precio(prendas) + this.recargo(prendas) + this.cuotas * this.coeficienteFijo;
    }
    
    public double recargo(List prendas)
    {
        double valorAgregado = 0.01;
        return prendas.stream().map(prenda -> prenda.precioFinal() * valorAgregado).sum();
    }
 }