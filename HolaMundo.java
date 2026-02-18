import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola! Bienvenido al programa en Java");

        System.out.print("Escribe tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("Mucho gusto " + nombre + " ");
        System.out.println("Este es tu primer programa en Java!");

        teclado.close();
    }
}
