public class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String marca, String modelo, double tarifaBase, int cilindrada) {
        super(marca, modelo, tarifaBase);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Motocicleta: " + marca + " " + modelo);
        System.out.println("Tarifa: " + tarifaBase + " $");
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
