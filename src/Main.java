import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<Empleado>lstEmpleados = new ArrayList<>();

        /*
         //opcion 1
        List<EmpleadoAdministrativo> lstEmpleadoAdm= new ArrayList<>();
        List<EmpleadoVentas> lstEmpleadoVen= new ArrayList<>();
        List<EmpleadoHoras> lstEmpleadoHoras= new ArrayList<>();

        //opcion 2
        List<Empleado>lstEmpleados = new ArrayList<>();

        EmpleadoAdministrativo ea1 = new EmpleadoAdministrativo( "Alberto",32, 3200000,560000);
        EmpleadoHoras eh1 = new EmpleadoHoras("Gabriela",27, 3500000, 14, 85000);
        EmpleadoVentas ev1 = new EmpleadoVentas("Joaquin",37,  2400000, 6, 45);

         //opcion 1
        lstEmpleadoAdm.add(ea1);
        lstEmpleadoVen.add(ev1);
        lstEmpleadoHoras.add(eh1);

        System.out.println(lstEmpleadoAdm);
        System.out.println(lstEmpleadoVen);
        System.out.println(lstEmpleadoHoras);

        //opcion 2
        lstEmpleados.add(ea1);
        lstEmpleados.add(ev1);
        lstEmpleados.add(eh1);
        System.out.println(lstEmpleados);

         */

        int opc, opc1, opc2;

        System.out.println(" Registro de Empleados\n");

        do {
            System.out.println("Menú del Sistema\n");
            System.out.println("Elige una opcion:\n ");
            System.out.println(" 1. Registrar al Empleado.");
            System.out.println(" 2. Mostar a los Empleado.");
            System.out.println(" 3. Buscar Empleados.");
            System.out.println(" 4. Salir.");
            opc= teclado.nextInt();

            switch (opc){
                case 1: /* Registro*/
                    do {
                        System.out.println("   Registrar empleados   \n ");
                        System.out.println(" Que tipo de empleado desesa registrar");
                        System.out.println("1. Empleado Administrativo");
                        System.out.println("2. Empleado Ventas");
                        System.out.println("3. Empleado x Horas");
                        System.out.println("4.Salir ");
                        opc1= teclado.nextInt();
                        switch (opc1) {

                            case 1:/* Empleado Administrativo*/

                                System.out.println("Nombre: ");
                                String nombre_ad = teclado.next();
                                System.out.println("Edad: ");
                                int Edad_ad = teclado.nextInt();
                                System.out.println("Salario Base: ");
                                double salarioBase_ad = teclado.nextDouble();
                                System.out.println("Bonificacion Fija: ");
                                double bonificacionFija_ad = teclado.nextDouble();
                                lstEmpleados.add(new EmpleadoAdministrativo(nombre_ad,Edad_ad,salarioBase_ad,bonificacionFija_ad));
                                System.out.println("Su registro fue exitoso...\n");


                                break;

                            case 2:/*Empleado Ventas*/

                                System.out.println("Nombre: ");
                                String nombre_eV = teclado.next();
                                System.out.println("Edad: ");
                                int Edad_eV = teclado.nextInt();
                                System.out.println("Salario Base: ");
                                double salarioBase_eV = teclado.nextDouble();
                                System.out.println("Porcentaje Comisión: ");
                                double Comision = teclado.nextDouble();
                                System.out.println("Total de Ventas en el Mes: ");
                                double totalVentas = teclado.nextDouble();
                                lstEmpleados.add(new EmpleadoVentas(nombre_eV,Edad_eV,salarioBase_eV,Comision,totalVentas));
                                System.out.println("Registro Completado...\n");

                                break;
                            case 3:/*Empleado x Horas*/

                                System.out.println("Nombre: ");
                                String nombre_eH = teclado.next();
                                System.out.println("Edad: ");
                                int Edad_eH = teclado.nextInt();
                                System.out.println("Salario Base: ");
                                double salarioBase_eH = teclado.nextDouble();
                                System.out.println("Horas trabajadas: ");
                                int horasTrabajdas= teclado.nextInt();
                                System.out.println("Valor x Hora: ");
                                double valorhora = teclado.nextDouble();
                                lstEmpleados.add( new EmpleadoHoras(nombre_eH,Edad_eH,salarioBase_eH,horasTrabajdas,valorhora));
                                System.out.println("Registro Completado con exito ...\n");

                                break;
                            case 4:
                                System.out.println(" Saliendo del sistema de Registro.\n");
                                System.out.println("..........///.......///.......////....//\n");
                                break;
                            default:
                                System.out.println(" Error ");


                        }
                    }while (opc1 != 4);

                    break;
                case 2:/*Mostrar empleados Registrados*/
                    int op;
                    System.out.println('\n'+"Mostrar Empleados ");
                    System.out.println(" 1. Mostrar Empleados Administrartivos");
                    System.out.println(" 2. Mostrar Empleados Ventas");
                    System.out.println(" 3. Mostrar Empleados x Horas");
                    System.out.println(" 4. Mostrar todos los Empleados");
                   op = teclado.nextInt();
                    switch (op){
                        case 1:/* Empleado administrativo*/
                            for (Empleado e : lstEmpleados){
                                if (e instanceof EmpleadoAdministrativo){
                                    System.out.println(e);
                                }
                            }
                            break;
                        case 2:/*Empleado Ventas*/
                            for (Empleado e : lstEmpleados){
                                if (e instanceof EmpleadoVentas){
                                    System.out.println(e);
                                }
                            }
                            break;
                        case 3:/*Empleado x Horas*/
                            for (Empleado e : lstEmpleados){
                                if (e instanceof EmpleadoHoras){
                                    System.out.println(e);
                                }
                            }
                            break;
                        case 4:
                            for (Empleado e : lstEmpleados){
                                System.out.println(e);
                                System.out.println('\n');
                            }
                            break;
                        default:
                            System.out.println(" Error ");
                    }

                    break;
                case 3:/*Buscar empleados*/


                    String nombreE;
                    System.out.println("Cual es el nombre del empleado a buscar: ");
                    nombreE = teclado.next();
                    if (lstEmpleados.isEmpty()){
                        System.out.println("La lista no tiene elementos. \n");
                    }
                    Empleado E1 = null;
                    for (Empleado e : lstEmpleados){
                        if(e.getNombre().equalsIgnoreCase(nombreE)){
                            E1 = e;
                            System.out.println(E1.mostrarInfo());
                        }
                    }
                    do {
                        System.out.println("   Hacer Cambios o Calcular el salario \n ");
                        System.out.println("      1. Modificar Salario ");
                        System.out.println("        2. Calcular salario");
                        System.out.println("         3. Mostrar si es mayor de edad ");
                        System.out.println("          4.Salir ");
                        opc2= teclado.nextInt();
                        switch (opc2) {

                            case 1:/*Modificar Salario Base*/
                                System.out.println(" Cual es el valor que desea aumentar al salario base ");
                                double aumento=teclado.nextDouble();
                                E1.setSalarioBase(E1.getSalarioBase() + aumento);
                                System.out.println("Al salario base se le aumento $" + aumento );
                                break;


                            case 2:/*Calcular Salario*/
                                System.out.println("Calcular Salario");
                                double salario = E1.calcularSalario();
                                System.out.println("Total del Salario: "+ salario+  "\n" );
                                break;
                            case 3:/*Mostrar si es mayor de edad*/
                                if (E1.getEdad()>= 18){
                                    System.out.println("El empleado es Mayor de edad. "+ E1.getEdad()+ " Años \n");
                                }else {
                                    System.out.println("El empleado es menor de edad. "+ E1.getEdad() +" Años \n");
                                }

                                break;
                            case 4:
                                System.out.println(" Volviendo al menu principal.\n");
                                break;
                            default:
                                System.out.println(" Error ");
                        }
                    }while (opc2 != 4);

                    break;

                case 4:
                    System.out.println(" Saliendo del sistema.");
                    System.out.println("..........///.......///.......////....//");
                    break;
            default:
                System.out.println(" Error ");
            }

        }while (opc!=4);

    }
}