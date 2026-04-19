import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Ejercicio2 r = new Ejercicio2();
        System.out.print("Ingrese Hora: ");
int h = sc.nextInt();
        System.out.print("Ingrese minutos: ");
int m = sc.nextInt();
        System.out.print("Ingrese segundos: ");
int s = sc.nextInt();
        r.establecerHora(h, m , s);
        r.mostrarHora();
        r.avanzarSegundos();
        r.mostrarHora();
    }
int h;
int m;
int s;

void establecerHora(int Hora, int Minutos, int Segundos){
    h = Hora;
    m = Minutos;
    s = Segundos;
}

void mostrarHora(){
    System.out.println(h + ":" + m + ":" + s);
}

void avanzarSegundos(){
    s++;

    if (s >= 60){
        s = 0;
        m++;
    }

    if (m >= 60) {
        m = 0;
        h++;
    }
    if (h >= 24) {
        h = 0;
    }
}
}