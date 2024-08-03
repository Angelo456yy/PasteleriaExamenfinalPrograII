
public class Main {
    public static void main(String[] args) {

        Sucursal Paris = new Sucursal("Sucursal Paris", "Torre");
        Sucursal NuevaYork = new Sucursal("Sucursal Nueva York", "Torres Tercias");


        Postre pastel = new Pastel("pastel");
        Postre crepa = new Crepa("crepa");


        Paris.agregarEspecialidad(crepa);
        NuevaYork.agregarEspecialidad(pastel);


        Empleado juan = new Empleado("Juan Perez", "Pastelero", 3000);
        Empleado mario = new Empleado("Mario Rossi", "Pastelero", 1200);


        Paris.agregarEmpleado(juan);
        NuevaYork.agregarEmpleado(mario);




        Paris.agregarIngrediente(masa);
        Paris.agregarIngrediente(relleno);
        Paris.agregarIngrediente(cobertura);


        Equipo horno = new Equipo("Horno", "Operativa");


        Paris.agregarEquipo(horno);


        crepa.agregarIngrediente(masa);
        crepa.agregarIngrediente(relleno);
        crepa.agregarIngrediente(cobertura);

        crepa.preparar();
        crepa.servir();
    }
}