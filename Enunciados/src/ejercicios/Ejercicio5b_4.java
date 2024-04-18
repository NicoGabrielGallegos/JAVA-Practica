package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5b_4 {
    public static void ejecutar() {
        Scanner console = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        System.out.print("Ingrese un entero: ");
        int numeroCondicion = console.nextInt();

        System.out.println("Ingrese 20 enteros: ");
        for (int i = 0; i < 20; i++) {
            System.out.print((i + 1) + ". ");
            int nuevoNumero = console.nextInt();
            if (nuevoNumero > numeroCondicion) {
                numeros.add(nuevoNumero);
            }
        }
        System.out.println(numeros.toString());
    }
}