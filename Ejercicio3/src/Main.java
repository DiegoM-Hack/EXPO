import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Jugador jugador1 =new Jugador("Messi", 10,"Delantero");

        jugador1.mostrar();

        jugador1.actualizarPosicion("Defensa");
        jugador1.mostrar();

        System.out.println("Ingrese la nueva posicion del jugador: ");
        String nuevaPosicion = sc.nextLine();

        jugador1.actualizarPosicion(nuevaPosicion);
        jugador1.mostrar();

        sc.close();


    }
}