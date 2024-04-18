package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void ejecutar() {
        Scanner console = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<>();
        System.out.println("Ingrese 10 palabras: ");

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". ");
            palabras.add(console.nextLine());
        }

        boolean repetida = false;
        System.out.println("Ingrese una palabra: ");
        String palabra = console.nextLine();
        console.close();

        for (int i = 0; i < 10; i++) {
            if (palabra.equals(palabras.get(i))) {
                repetida = true;
                break;
            }
        }

        if (repetida) {
            System.out.print("La palabra ya había sido ingresada");
        } else {
            System.out.print("La palabra no había sido ingresada");
        }
    }
}
