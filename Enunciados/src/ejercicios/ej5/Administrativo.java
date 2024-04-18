package ejercicios.ej5;

public class Administrativo extends Empleado {
    private int hsExtra;
    private int hsMes;

    public int getHsExtra() {
        return hsExtra;
    }
    public void setHsExtra(int hsExtra) {
        this.hsExtra = hsExtra;
    }

    public int getHsMes() {
        return hsMes;
    }
    public void setHsMes(int hsMes) {
        this.hsMes = hsMes;
    }

    public Administrativo(){
        super();
    }

    public Administrativo(String dni, String nombre, String apellido, String email, int sueldoBase, int hsExtra, int hsMes) {
        super(dni, nombre, apellido, email, sueldoBase);
        this.setHsExtra(hsExtra);
        this.setHsMes(hsMes);
    }

    public double getSueldo() {
        return (this.getSueldoBase() * ((this.getHsExtra() * 1.5)+this.getHsMes()) / this.getHsMes());
    }

    public String toString() {
        return "Administrativo{" +
                "hsExtra=" + hsExtra +
                ", hsMes=" + hsMes +
                '}';
    }
}
