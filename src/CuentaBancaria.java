import java.util.Scanner;
public class CuentaBancaria {

    String numero;
    String titular;
    double saldo;

    CuentaBancaria(String n, String t, double s){
        numero = n;
        titular = t;
        saldo = s;
    }

    void depositar(double monto){
        saldo += monto;
    }

    void retirar(double monto) {
        if (monto > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= monto;
        }
    }

    double consultarSaldo(){
        return saldo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaBancaria cuenta = new
                CuentaBancaria("123", "Matias Paz", 1200);
        int Opcion = 1;
        while (Opcion != 0){
            System.out.println("Bienvenido al Banco Nacion");
            System.out.println("1- Depositar");
            System.out.println("2- Retirar");
            System.out.println("3- Ver saldo");
            System.out.println("0- Salir");

            Opcion = sc.nextInt();

            if (Opcion == 1){
                System.out.println("Ingrese un monto: ");
                double monto = sc.nextDouble();
                cuenta.depositar(monto);
            }
            if (Opcion == 2){
                System.out.println("Ingrese un monto");
                double monto = sc.nextDouble();
                cuenta.retirar(monto);
            }
            if (Opcion == 3){
                System.out.println("Saldo: " + cuenta.consultarSaldo());
            }
        }
        System.out.println("Seccion cerrada, vuelva pronto");
    }
}
