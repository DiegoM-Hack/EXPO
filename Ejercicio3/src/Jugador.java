
public class Jugador {
    String nombre;
    int numeroCamisa;
    String posicion;

    public Jugador(String nombre, int numeroCamisa, String posicion) {
        this.nombre = nombre;
        this.numeroCamisa = numeroCamisa;
        this.posicion = posicion;
    }

    // Méodo para actualizar la posicion
    public void actualizarPosicion(String nuevaPosicion) {
        System.out.println("Ingrese la nueva posicion: ");
        posicion = nuevaPosicion;

    }
    // Méodo para mostrar toda la información
    public void mostrar() {
        System.out.println("El jugador: " + nombre);
        System.out.println("Con numero de camisa: " + numeroCamisa);
        System.out.println("Tiene la posicion: " + posicion);
    }



}
