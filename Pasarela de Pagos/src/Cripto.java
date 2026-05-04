public class Cripto implements MetodoPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con cripto: $" + monto);
    }
}

