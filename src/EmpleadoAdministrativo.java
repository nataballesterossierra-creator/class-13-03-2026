public class EmpleadoAdministrativo extends Empleado{

    private double bonificacionFija;

    public EmpleadoAdministrativo() {
    }

    public EmpleadoAdministrativo(String nombre, int edad,  double salarioBase, double bonificacionFija) {
        super(nombre,edad, salarioBase);
        this.bonificacionFija = bonificacionFija;
    }

    public double getBonificacionFija() {
        return bonificacionFija;
    }

    public void setBonificacionFija(double bonificacionFija) {
        this.bonificacionFija = bonificacionFija;
    }

    @Override
    public String toString() {
        return super.toString()+"EmpleadoAdministrativo{" +
                "bonificacionFija=" + bonificacionFija +
                '}';
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ Edad);
        System.out.println("Salario Base: "+ salarioBase);
        System.out.println("Bonificacion Fija: "+ bonificacionFija);

    }
}
