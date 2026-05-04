public class Trasferencia implements MetodoPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando Transferencia: $" + monto);
    }
}
