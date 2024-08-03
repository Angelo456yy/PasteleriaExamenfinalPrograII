public class Brownie extends Postre {

    public Brownie(String nombre, String tamaño, double precio) {
        super(nombre, tamaño, precio);
    }


    @Override
    public void preparar() {
        System.out.println("Preparando Brownie" );
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo Brownie" + getNombre());
    }
}
