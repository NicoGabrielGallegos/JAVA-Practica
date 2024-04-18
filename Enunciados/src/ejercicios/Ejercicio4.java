package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void ejecutar() {
        Scanner console = new Scanner(System.in);
        int[] numeros = new int[20];

        System.out.print("Ingrese un entero: ");
        int numeroCondicion = console.nextInt();

        System.out.println("Ingrese 20 enteros: ");
        int j = 0;
        for (int i = 0; i < 20; i++) {
            System.out.print((i + 1) + ". ");
            int nuevoNumero = console.nextInt();
            if (nuevoNumero > numeroCondicion) {
                numeros[j] = nuevoNumero;
                j++;
            }
        }
        System.out.println(Arrays.toString(numeros));
    }
}