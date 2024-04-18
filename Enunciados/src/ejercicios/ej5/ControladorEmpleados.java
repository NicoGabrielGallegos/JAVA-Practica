package ejercicios.ej5;

public class ControladorEmpleados {

    public static Administrativo altaAdministrativo(String dni, String nombre, String apellido, String email, int sueldoBase, int hsExtra, int hsMes) {
        return new Administrativo(dni, nombre, apellido, email, sueldoBase, hsExtra, hsMes);
    }

    public static Vendedor altaVendedor(String dni, String nombre, String apellido, String email, int sueldoBase, double porcenComision, int totalVentas) {
        return new Vendedor(dni, nombre, apellido, email, sueldoBase, porcenComision, totalVentas);
    }
}
