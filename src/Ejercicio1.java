import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Ejercicio1 c = new Ejercicio1();
        System.out.println("Ingrese el Primer Numero: ");
        double a = sc.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        double b = sc.nextDouble();
        System.out.println("Suma: " + c.sumar(a, b));
        System.out.println("Resta: " + c.restar(a, b));
        System.out.println("Multiplicar: " + c.multiplicar(a, b));
        System.out.println("Division: " + c.dividir(a, b));
    }
    double sumar(double a, double b){
        return a + b;
    }
    double restar(double a, double b){
        return a - b;
    }
    double multiplicar(double a, double b){
        return a * b;
    }

    double dividir(double a, double b){
        if (b == 0){
            System.out.println("error");
            return 0;
        }
        return a / b;
    }
}
