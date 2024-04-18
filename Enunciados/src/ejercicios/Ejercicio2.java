package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio2 {
    public static void ejecutar() {
        Scanner console = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<>();
        System.out.println("Ingrese 10 palabras: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". ");
            palabras.add(console.nextLine());
        }
        System.out.println("Palabras en orden inverso:");
        for (int i = 9; i >= 0; i--) {
            System.out.println((i + 1) + ". " + palabras.get(i));
        }
        console.close();
    }

    //public static void ejecutar() {
    //    Scanner console = new Scanner(System.in);
    //    String[] palabras = new String[10];
    //    System.out.println("Ingrese 10 palabras: ");
    //    for (int i = 0; i < 10; i++) {
    //        System.out.print((i + 1) + ". ");
    //        palabras[i] = console.nextLine();
    //    }
    //    System.out.println("Palabras en orden inverso:");
    //    for (int i = 9; i >= 0; i--) {
    //        System.out.println((i + 1) + ". " + palabras[i]);
    //    }
    //    console.close();
    //}
}
