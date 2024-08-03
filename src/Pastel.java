public class Pastel extends Postre {


    public Pastel(String nombre, String tamaño, double precio ) {
        super(nombre, tamaño, precio);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Pastel" );
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo Pastel" + getNombre());
    }
}