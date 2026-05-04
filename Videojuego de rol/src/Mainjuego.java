import java.util.ArrayList;

public class Mainjuego {
    public static void main(String[] args) {
        ArrayList<Entidadbase> entidades = new ArrayList<>();

        entidades.add(new Guerrero(0, 0, 100));
        entidades.add(new Mago(1, 1, 80));
        entidades.add(new Orco(2,2,120));
        entidades.add(new Dragon(3,3,250));


        for (Entidadbase e :entidades) {
            e.mover(1, 1);
            e.dibujar();
        }


        System.out.println("-------- MAGIAAA --------");

        for (Entidadbase e : entidades) {
            if (e instanceof LanzadorHechizos) {
                ((LanzadorHechizos) e).lanzarHechizo();

            }
        }
}
}
