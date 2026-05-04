import java.util.ArrayList;
import java.util.List;

public class MainSuscripcion {
    public static void main(String[] args) {

        ArrayList<Suscripcion> lista = new ArrayList<>();

        lista.add(new PlanBasico("Hugobenavidez@gmial.com" , 372, 12000));
        lista.add(new PlanFamiliar("martin333@gmail.com", 450, 25000, 3));
        lista.add(new PlanPremium("Lucasorosco@gmail.com", 689, 30000));


        double total = 0;

        for (Suscripcion S : lista) {
            total += S.calcularCostoMensual();
        }

        System.out.println("Total de ingresos: $" + total);
    }
}
