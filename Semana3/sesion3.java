package Semana3;

import java.util.Scanner;

public class sesion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leer dos números y deducir si están en orden creciente. a <= b
        int a = 0, b = 0;
        System.out.println("digite a: ");
        a = sc.nextInt(); // Capturamos por teclado el valor de "a"
        System.out.print("digite b: ");
        b = sc.nextInt();
        // Condicional para deducir si están en orden creciente o decreciente
        if (a <= b) {
            System.out.println("Orden creciente");
        } else {
            System.out.println("Orden decreciente");
        }
        sc.close();
    }
}

