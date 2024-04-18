package ejercicios;
import ejercicios.ej5.*;

import java.util.Scanner;

public class Ejercicio5a {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        Empleado empleados[] = new Empleado[20];
        while (i < 20) {
            System.out.println("""
            \u001b[94mSeleccione el tipo de empleado
            \u001b[93m1\u001b[90m.\u001b[0m Administrativo
            \u001b[93m2\u001b[90m.\u001b[0m Vendedor
            \u001b[91m0\u001b[90m.\u001b[0m Salir""");
            String opcion = scanner.nextLine();
            String dni;
            String nombre;
            String apellido;
            String email;
            int sueldoBase;
            switch (opcion) {
                case "0":
                    i = 20;
                    break;
                case "1":
                    System.out.println("Ingrese el dni del empleado:");
                    dni = scanner.nextLine();

                    System.out.println("Ingrese el nombre del empleado:");
                    nombre = scanner.nextLine();

                    System.out.println("Ingrese el apellido del empleado:");
                    apellido = scanner.nextLine();

                    System.out.println("Ingrese el email del empleado:");
                    email = scanner.nextLine();

                    System.out.println("Ingrese el sueldo base del empleado:");
                    sueldoBase = Integer.parseInt(scanner.nextLine());

                    System.out.println("Ingrese el sueldo base del empleado:");
                    int hsExtra = Integer.parseInt(scanner.nextLine());

                    System.out.println("Ingrese el sueldo base del empleado:");
                    int hsMes = Integer.parseInt(scanner.nextLine());

                    empleados[i] = ControladorEmpleados.altaAdministrativo(dni, nombre, apellido, email, sueldoBase, hsExtra, hsMes);
                    i++;
                    break;
                case "2":
                    System.out.println("Ingrese el dni del empleado:");
                    dni = scanner.nextLine();

                    System.out.println("Ingrese el nombre del empleado:");
                    nombre = scanner.nextLine();

                    System.out.println("Ingrese el apellido del empleado:");
                    apellido = scanner.nextLine();

                    System.out.println("Ingrese el email del empleado:");
                    email = scanner.nextLine();

                    System.out.println("Ingrese el sueldo base del empleado:");
                    sueldoBase = Integer.parseInt(scanner.nextLine());

                    System.out.println("Ingrese el sueldo base del empleado:");
                    double porcenComision = Double.parseDouble(scanner.nextLine());

                    System.out.println("Ingrese el sueldo base del empleado:");
                    int totalVentas = Integer.parseInt(scanner.nextLine());

                    empleados[i] = ControladorEmpleados.altaVendedor(dni, nombre, apellido, email, sueldoBase, porcenComision, totalVentas);
                    i++;
                    break;
                default:
                    break;
            }
        }
        scanner.close();

    }
}
