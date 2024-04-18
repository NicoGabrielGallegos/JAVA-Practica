package ejercicios.ej5;

public class Vendedor extends Empleado{
    private double porcenComision;
    private int totalVentas;

    public double getPorcenComision() {
        return porcenComision;
    }
    public void setPorcenComision(double porcenComision) {
        this.porcenComision = porcenComision;
    }

    public int getTotalVentas() {
        return totalVentas;
    }
    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }

    public Vendedor() {
        super();
    }

    public Vendedor(String dni, String nombre, String apellido, String email, int sueldoBase, double porcenComision, int totalVentas) {
        super(dni, nombre, apellido, email, sueldoBase);
        this.setPorcenComision(porcenComision);
        this.setTotalVentas(totalVentas);
    }

    public double getSueldo() {
        return (this.getSueldoBase() + (this.getPorcenComision() * this.getTotalVentas() / 100));
    }
}
