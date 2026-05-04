public class Celular implements FotoInterface, Wifi {

    @Override
    public void tomarFoto() {
        System.out.println("El celular esta tomando una foto");
    }

    @Override
    public void conectarWifi() {
        System.out.println("El celular se ha conectado a wifi");
    }
}
