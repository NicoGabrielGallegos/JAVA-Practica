package ejercicios;

public class Ejercicio1 {
    public static void ejecutar() {
        System.out.println("Primeros 10 números enteros");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + (i + 1));
        }
        System.out.println();
        System.out.println("Primeros 10 números impares");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + (2*i + 1));
        }
    }
}
