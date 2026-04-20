import java.util.Scanner;

public class Empleado {

    static int total = 0;

    int legajo;
    String nombre;
    double salario;

    Empleado(int l, String n, double s){
        legajo = l;
        nombre = n;
        salario = s;
        total++;
    }

    void aumentoPorcentaje(double p){
        salario = salario + (salario * p / 100);
    }

    void aumentoFijo(double monto){
        salario = salario + monto;
    }

    void mostrar(){
        System.out.println("Legajo: " + legajo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }

    static void mostrarTotal(){
        System.out.println("Total empleados: " + total);
    }

    // 👉 MAIN ADENTRO DE LA CLASE
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Empleado emp = new Empleado(193, "Matias", 260000);

        int opcion = 1;

        while(opcion != 0){

            System.out.println("1- Aumentar por porcentaje");
            System.out.println("2- Aumentar monto fijo");
            System.out.println("3- Mostrar empleado");
            System.out.println("4- Mostrar total empleados");
            System.out.println("0- Salir");

            opcion = sc.nextInt();

            if(opcion == 1){
                System.out.println("Ingrese porcentaje:");
                double p = sc.nextDouble();
                emp.aumentoPorcentaje(p);
            }

            if(opcion == 2){
                System.out.println("Ingrese monto:");
                double m = sc.nextDouble();
                emp.aumentoFijo(m);
            }

            if(opcion == 3){
                emp.mostrar();
            }

            if(opcion == 4){
                Empleado.mostrarTotal();
            }
        }

        System.out.println("Fin");
    }
}