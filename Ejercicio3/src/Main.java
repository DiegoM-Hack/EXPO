import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Escaner
        Scanner sc = new Scanner(System.in);
        Jugador jugador1 =new Jugador("Messi", 10,"Delantero");

        //Llamar al metodo
        jugador1.mostrar();

        jugador1.actualizarPosicion("Defensa");
        jugador1.mostrar();

        //Actualizar por consola
        System.out.println("Ingrese la nueva posicion del jugador: ");
        String nuevaPosicion = sc.nextLine();

        jugador1.actualizarPosicion(nuevaPosicion);
        jugador1.mostrar();

        sc.close();


    }
}