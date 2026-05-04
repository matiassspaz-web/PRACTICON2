import java.util.ArrayList;

public class Mainvehiculo {
    public static void main(String[] args) {

        ArrayList<Vehiculo> flota = new ArrayList<>();

        flota.add(new Furgoneta("Kangoo", "Transit", 10000, 1200));
        flota.add(new Motocicleta("Motomel", "s2", 5000, 150));
        flota.add(new Furgoneta("Iveco",  "Daily", 10000, 2100 ));
        flota.add(new Motocicleta("Yamaha", "YBR", 5000, 150 ));

        for (Vehiculo V : flota) {
            V.mostrarInfo();
        }
    }
}
