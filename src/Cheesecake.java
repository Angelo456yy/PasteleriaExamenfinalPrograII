public class Cheesecake extends Postre {

    public Cheesecake(String nombre, String tamaño, double precio) {
        super(nombre, tamaño, precio);
    }


    @Override
    public void preparar() {
        System.out.println("Preparando Cheesecake" );
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo Cheesecake" + getNombre());
    }
}
