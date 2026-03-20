public class EmpleadoHoras extends Empleado{

    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoHoras() {
    }

    public EmpleadoHoras( String nombre, int edad,double salarioBase, int horasTrabajadas, double valorHora) {
        super(nombre, edad,  salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return super.toString()+ " EmpleadoHoras " +
                "horasTrabajadas= " + horasTrabajadas +
                ", valorHora=" + valorHora;
    }

    public String mostrarInfo(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ Edad+ " Años");
        System.out.println("Tipo de Empleado: x Horas");
        System.out.println("Salario Base: $"+ salarioBase);
        System.out.println("Horas Trabajadas: "+ horasTrabajadas+ "Al mes");
        System.out.println("Valor x Hora: $"+ valorHora);

        return "";
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasTrabajadas * valorHora);
    }

}
