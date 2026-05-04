public class Furgoneta extends Vehiculo {
    private double capacidadCarga;
    public Furgoneta(String marca, String modelo, double tarifaBase, double capacidadCarga) {
        super(marca, modelo, tarifaBase);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Furgoneta: " + marca + " " + modelo);
        System.out.println("Tarifa: " + tarifaBase + " $");
        System.out.println("Capacidad: " + capacidadCarga + " kg");

    }
}
