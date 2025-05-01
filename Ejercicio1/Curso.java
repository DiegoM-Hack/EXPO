import java.util.Scanner;

public class Curso{

    // Atributos de la clase
    String nombre;
    String codigo;
    int creditos;


    //costructor
    public Curso(String nombre, String codigo, int creditos){
        this.nombre= nombre;
        this.codigo= codigo;
        this.creditos= creditos;
    }

    //metodo
    public void mostrar_info(){
        System.out.println("Datos del Curso");
        System.out.println("------------------------------");
        System.out.println("Nombre:" + nombre);
        System.out.println("Codigo:" + codigo);
        System.out.println("Creditos:" +creditos);
    }

    public void actualizar_info(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nuevo numero de creditos : ");
        int nuevos_creditos = sc.nextInt();
        this.creditos = nuevos_creditos;
    }
}
