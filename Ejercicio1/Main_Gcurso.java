import java.util.Scanner;

public class Main_Gcurso {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);

        //pedir informacion
        System.out.print("Ingrese el Nombre:");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el Codigo:");
        String codigo = scanner.nextLine();

        System.out.print("Ingrese los Creditos:");
        int creditos = scanner.nextInt();
        scanner.nextLine();


        // Crear objeto
        Curso estudiante1=new Curso(nombre, codigo, creditos);

        //Visualizar info
        estudiante1.mostrar_info();


        // Ingreso Para Actualizar
        System.out.print("¿Desea actualizar los créditos? (S/N): ");
        String opcion = scanner.nextLine();

        if (opcion.equalsIgnoreCase("S")) {
            estudiante1.actualizar_info();
            System.out.println("\nCréditos actualizados:");
            estudiante1.mostrar_info();
        } else {
            System.out.println("\nNo se realizaron cambios.");
        }
    }
}
