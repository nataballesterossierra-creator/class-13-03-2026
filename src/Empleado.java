public class Empleado {


    protected String nombre;
    protected int Edad;
    protected  double salarioBase;

    public Empleado() {
    }

    public Empleado( String nombre, int edad, double salarioBase) {

        this.nombre = nombre;
        Edad = edad;
        this.salarioBase = salarioBase;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado:" +
                "Nombre= " + nombre + '\'' +
                ", Edad= " + Edad + '\''+
                ", SalarioBase=" + salarioBase ;
    }
    public String mostrarInfo(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ Edad+ " Años");
        System.out.println("Salario Base: $"+ salarioBase);

        return "";
    }
    public double calcularSalario() {
        return 0;
    }

}
