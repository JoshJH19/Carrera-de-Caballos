import java.util.Random;
class Principal {


    public static void main(String[] args) {


        Caballos Caballo1 = new Caballos("Rojo", 0, 0, false);
        Caballos Caballo2 = new Caballos("Azul", 0, 0, false);
        Caballos Caballo3 = new Caballos("Amarillo", 0, 0, false);
        Caballos Caballo4 = new Caballos("Verde", 0, 0, false);
        Caballo1.listos();
        Caballo2.listos();
        Caballo3.listos();
        Caballo4.listos();
        for (int i = 0; i < 10; i++) {

            Random hrs = new Random();
            int V1 = hrs.nextInt(20);
            int V2 = hrs.nextInt(20);
            int V3 = hrs.nextInt(20);
            int V4 = hrs.nextInt(20);
            System.out.println("-----------------------------------");
            Caballo1.Carrera(V1);
            System.out.println("-----------------------------------");
            Caballo2.Carrera(V2);
            System.out.println("-----------------------------------");
            Caballo3.Carrera(V3);
            System.out.println("-----------------------------------");
            Caballo4.Carrera(V4);
            System.out.println("-----------------------------------");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        if (Caballo1.getVelocidade() > Caballo2.getVelocidade() && Caballo1.getVelocidade() > Caballo3.getVelocidade() && Caballo1.getVelocidade() > Caballo4.getVelocidade()) {
            System.out.println("Gano el caballo 1");
        }
        if (Caballo2.getVelocidade() > Caballo3.getVelocidade() && Caballo2.getVelocidade() > Caballo4.getVelocidade() && Caballo2.getVelocidade() > Caballo1.getVelocidade()) {
            System.out.println("Gano el caballo 2");
        }
        if (Caballo3.getVelocidade() > Caballo4.getVelocidade() && Caballo3.getVelocidade() > Caballo1.getVelocidade() && Caballo3.getVelocidade() > Caballo2.getVelocidade()) {
            System.out.println("Gano el caballo 3");
        }
        if (Caballo4.getVelocidade() > Caballo1.getVelocidade() && Caballo4.getVelocidade() > Caballo2.getVelocidade() && Caballo4.getVelocidade() > Caballo3.getVelocidade()) {
            System.out.println("Gano el caballo 4");
        }
    }
}