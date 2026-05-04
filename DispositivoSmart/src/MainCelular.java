import java.util.ArrayList;

public class MainCelular {
    public static void main(String[] args) {

        ArrayList<Object> dispositivos = new ArrayList<>();

        dispositivos.add(new camara());
        dispositivos.add(new Termostato());
        dispositivos.add(new Celular());


        for (Object d : dispositivos) {
            if (d instanceof Wifi) {
                ((Wifi)d).conectarWifi();
            }
        }
    }
}
