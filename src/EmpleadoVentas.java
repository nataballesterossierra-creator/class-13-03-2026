public class EmpleadoVentas extends Empleado{

    private double totalVentas;
    private double Comision;

    public EmpleadoVentas() {
    }

    public EmpleadoVentas( String nombre,int edad, double salarioBase, double comision, double totalVentas) {
        super( nombre,edad, salarioBase);
        Comision = comision;
        this.totalVentas = totalVentas;
    }

    public double getComision() {
        return Comision;
    }

    public void setComision(double comision) {
        Comision = comision;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    @Override
    public String toString() {
        return super.toString()+"EmpleadoVentas{" +
                "Comision=" + Comision +
                ", totalVentas=" + totalVentas +
                '}';
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ Edad);
        System.out.println("Salario Base: "+ salarioBase);
        System.out.println(" Total Ventas: "+ totalVentas);
        System.out.println("Comisión: "+ Comision);

    }
}
