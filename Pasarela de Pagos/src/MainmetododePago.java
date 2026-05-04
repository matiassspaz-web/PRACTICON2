import java.util.ArrayList;

public class MainmetododePago {
    public static void main(String[] args) {
        ArrayList<MetodoPago> pagos = new ArrayList<>();

        pagos.add(new TarjetasCredito());
        pagos.add(new Trasferencia());
        pagos.add(new Cripto());
        pagos.add(new Paypal());

        for (MetodoPago p : pagos) {
            p.procesarPago(10000);
        }
    }
}
