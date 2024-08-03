
public class Masa implements Ingrediente {
    private double cantidad;

    public Masa(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Masa";
    }

    @Override
    public double obtenerCantidad() {
        return cantidad;
    }
}
