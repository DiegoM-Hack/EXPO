public class Ciclista {
    // Atributos
    String nombre;
    int edad;
    double kilometrosRecorridos;

    // Constructor
    public Ciclista(String nombre, int edad, double kilometrosRecorridos) {
        this.nombre = nombre;
        this.edad = edad;
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    // Método para mostrar toda la información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Kilómetros recorridos: " + kilometrosRecorridos + " km");
    }

    // Método para actualizar los kilómetros recorridos
    public void agregarKilometros(double nuevosKilometros) {
        kilometrosRecorridos += nuevosKilometros;
    }

    // Método para calcular el promedio mensual de kilómetros
    public double promedioMensual() {

        return kilometrosRecorridos / 12;
    }
}

