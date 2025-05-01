import java.util.Scanner;

public class Libro {

    // Atributos de la clase

    String titulo;
    String autor;
    int anio_publicacion;


    //costructor

    public Libro(String titulo, String autor, int anio_publicacion){
        this.titulo= titulo;
        this.autor= autor;
        this.anio_publicacion= anio_publicacion;
    }


    //metodos
    public void mostrar_info(){

        System.out.println("Titulo:" + titulo);
        System.out.println("Autor:" + autor);
        System.out.println("Año de Publicación:" +anio_publicacion);
    }

    public void actualizar_info(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nuevo año de publicacion: ");
        int nuevo_apublicacion = sc.nextInt();
        this.anio_publicacion = nuevo_apublicacion;
    }
}
