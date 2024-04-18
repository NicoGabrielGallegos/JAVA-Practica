package ejercicios.ej5;

public abstract class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private double sueldoBase;

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public Empleado() {
    }
    public Empleado(String dni, String nombre, String apellido, String email, int sueldoBase) {
        this.setDni(dni);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEmail(email);
        this.setSueldoBase(sueldoBase);
    }

    public abstract double getSueldo();
}
