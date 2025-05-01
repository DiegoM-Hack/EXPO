import java.util.Scanner;

public class Main_Libro {

    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);

        // para dos objetos
        int cantidadl=2;

        Libro[] Libros=new Libro[cantidadl];

        //Pedir informacion

        for(int i= 0;i<cantidadl ;i++ ){
            System.out.println("\nIngrese los datos del libro " + (i + 1));

            System.out.print("Ingrese el Titulo:" );
            String titulo = scanner.nextLine();

            System.out.print("Ingrese el Autor:");
            String autor = scanner.nextLine();

            System.out.print("Ingrese el año de publicación:");
            int anio_publicacion = scanner.nextInt();
            scanner.nextLine();

            // Crear objeto
            Libros[i]=new Libro(titulo, autor, anio_publicacion);
        }


        //Visualizar info
        System.out.println("==== Datos DE LOS LIBROS ====");
        for(int i=0; i<cantidadl ;i++){
            System.out.println("\nLibro "+(i+1)+":");
            Libros[i].mostrar_info();
        }


        // Ingreso Para Actualizar
        for(int i=0; i<cantidadl ;i++){
            System.out.print("¿Desea actualizar el libro "+(i+1)+"? (S/N): ");
            String opcion = scanner.nextLine();

            if (opcion.equalsIgnoreCase("S")) {

                System.out.println("Actualizando  Año de publicacion del Libro " + (i + 1) + ":");
                Libros[i].actualizar_info();
                System.out.println("\nAño de Publicacion actualizado:");
            } else {
                System.out.println("\nNo se realizaron cambios en Libro" + (i + 1));
            }

        }

        //Visualizar actualizaciones
        System.out.println("\n === DATOS Actualizado de los Libros ===");
        for (int i = 0; i < cantidadl ; i++) {
            System.out.println("\nLibro" + (i + 1) + ":");
            Libros[i].mostrar_info();
        }

    }
}
