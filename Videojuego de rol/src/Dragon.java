public class Dragon extends Mounstruo implements LanzadorHechizos {

        public Dragon(int x, int y, int vida) {
            super(x, y, vida);

        }
        
        @Override
        public void dibujar() {
            System.out.println("Dragon en (" + x + "," + y + ")");
        }

        @Override
        public void lanzarHechizo() {
            System.out.println("Dragon lanza fuego magico");
        }
    }

