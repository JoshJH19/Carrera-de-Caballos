import java.util.Random;
import java.util.Scanner;

class Principal {


    public static void main(String[] args) {
        Caballos Caballo1 = new Caballos("Rojo", 0, 0, false);
        Caballos Caballo2 = new Caballos("Azul", 0, 0, false);
        Caballos Caballo3 = new Caballos("Amarillo", 0, 0, false);
        Caballos Caballo4 = new Caballos("Verde", 0, 0, false);
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        boolean puntos = false;
        boolean puntos1 = false;
        boolean rondas = false;

        System.out.println("---------------------------Menu---------------------");
        System.out.println("1.-Modo por rondas");
        System.out.println("2.-Modo por puntos");
        System.out.println("3.-Salir");
        System.out.println("------------------------------------------------------");
        Caballo1.listos();
        Caballo2.listos();
        Caballo3.listos();
        Caballo4.listos();

        while (!salir) {
            if (sc.hasNextInt()) {
                int modo = sc.nextInt();
                switch (modo) {
                    case 1:
                        System.out.println("Modo por rondas");
                        while (!rondas) {
                            System.out.println("Escriba la cantidad de rondas requeridos para ganar(Solo numeros):");
                            if (sc.hasNextInt()) {

                                int ronda = sc.nextInt();
                                System.out.println("Eliga el numero maximo que puede tener los numeros aleatorios(Solo numeros):");
                                int mAleatorio = sc.nextInt();

                                for (int i = 0; i < ronda; i++) {

                                    Random hrs = new Random();

                                    int V1 = hrs.nextInt(mAleatorio);
                                    int V2 = hrs.nextInt(mAleatorio);
                                    int V3 = hrs.nextInt(mAleatorio);
                                    int V4 = hrs.nextInt(mAleatorio);
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
                            } else {
                                System.out.println("Simbolos no aceptados");
                                sc.next();
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Modo por puntos");

                        while (!puntos) {

                            System.out.println("Escriba la cantidad de numeros requeridos para ganar(Solo numeros):");
                            if (sc.hasNextInt()) {
                                int punto = sc.nextInt();
                                System.out.println("Eliga el numero maximo que puede tener los numeros aleatorios(Solo numeros):");
                                int mAleatorio = sc.nextInt();

                                while (!puntos1) {
                                    Random hrs = new Random();
                                    int V1 = hrs.nextInt(mAleatorio);
                                    int V2 = hrs.nextInt(mAleatorio);
                                    int V3 = hrs.nextInt(mAleatorio);
                                    int V4 = hrs.nextInt(mAleatorio);
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

                                    if (Caballo1.getVelocidade() >= punto || Caballo2.getVelocidade() >= punto || Caballo3.getVelocidade() >= punto || Caballo4.getVelocidade() >= punto) {
                                        puntos1 = true;
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

                                System.out.println("\nQuieres repetir el modo? (S/N)");
                                if (sc.hasNextLine()) {
                                    String repetir = sc.nextLine();
                                    if (repetir.equals("S")) {
                                        System.out.println("Repitiendo el modo");
                                    } else if (repetir.equals("N")) {
                                        puntos = true;
                                        System.out.println("Gracias por jugar");
                                    }
                                } else {
                                    System.out.println("Simbolo invalido");
                                    sc.next();
                                }
                            } else {
                                System.out.println("Simbolos no aceptados");
                                sc.next();
                            }
                        }
                            break;

                             case 3:
                                System.out.println("Salir");
                                salir = true;
                                break;
                }
            } else System.out.println("Opcion invalida");
            sc.next();
        }
    }
}

