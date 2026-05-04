public class TarjetasCredito implements MetodoPago {


    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con Tarjeta de credito: $" + monto);
    }
}
