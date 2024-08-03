public class Crepa extends Postre {
    private String tipoGrano;

    public Crepa(String nombre, String tamaño, double precio) {
        super(nombre, tamaño, precio);
    }


    @Override
    public void preparar() {
        System.out.println("Preparando Crepa" );
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo Crepa" + getNombre());
    }
}
