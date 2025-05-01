//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Ciclista c1 = new Ciclista("Egan Bernal", 26, 4200);
        Ciclista c2 = new Ciclista("Nairo Quintana", 33, 3900);
        Ciclista c3 = new Ciclista("Rigoberto Urán", 37, 4100);

        // Mostrar información
        System.out.println("---- Ciclista 1 ----");
        c1.mostrarInformacion();
        System.out.println("Promedio mensual: " + c1.promedioMensual() + " km\n");

        // Agregar kilómetros a c1
        c1.agregarKilometros(120);
        System.out.println("---- Después de nueva competencia ----");
        c1.mostrarInformacion();
        System.out.println("Nuevo promedio mensual: " + c1.promedioMensual() + " km");
    }
}