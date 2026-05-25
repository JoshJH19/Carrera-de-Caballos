//Importamos el paquete scanner y random que utilizaremos dentro de la clase
//El paquete random sera utlizado para ayudar con la velocidad de los caballos que sera aleatoria para conseguir un ganador
import java.util.Random;
//El scanner ayudara a elegir el modo, definir los puntos y en que rango de numeros aleatorios se pueda elegir
import java.util.Scanner;

class Principal {


    public static void main(String[] args) {

        //Los objectos llamdos caballos los cuales vamos a utilizar en todo el programa
        Caballos Caballo1 = new Caballos("Rojo", 0, false);
        Caballos Caballo2 = new Caballos("Azul", 0, false);
        Caballos Caballo3 = new Caballos("Amarillo", 0,  false);
        Caballos Caballo4 = new Caballos("Verde", 0,  false);

        //Iniciamos el objecto scanner para poder utilizarlo
        Scanner sc = new Scanner(System.in);

        //Con este boolean ayuda a que el ciclo se mantenga hasta que este cambie su valor por (true) para poder terminar con el ciclo
        boolean salir = false;

        //Inciar con un ciclo while y dentro de los parentesis escribir el nombre de la variable boolean para que este al cambiar valor termine el ciclo y el programa
        while (!salir) {

            System.out.println("---------------------------Menu-----------------------");
            System.out.println("1.-Modo por rondas");
            System.out.println("2.-Modo por puntos");
            System.out.println("3.-Salir");
            System.out.println("------------------------------------------------------");
            //Se crean los booleanos que ayudaran en los ciclo de cada modo para que estos puedan ser utilizados varias veces o cancelar
            boolean puntos = false;
            boolean rondas = false;
            if (sc.hasNextInt()) {
                int modo = sc.nextInt();
                switch (modo) {
                    case 1:
                        //En este modo es por rondas y esto es gracias a un for para que se eligan la cantidad de rondas que se van a jugar
                        System.out.println("Modo por rondas");
                        while (!rondas) {
                            System.out.println("Escriba la cantidad de rondas requeridos para ganar(Solo numeros):");
                            if (sc.hasNextInt()) {

                                int ronda = sc.nextInt();
                                System.out.println("Eliga el numero maximo que puede tener los numeros aleatorios(Solo numeros):");
                                int mAleatorio = sc.nextInt();
                                //Se crea una cuenta regresiva para empezar la carrera
                                for  (int i = 4; i > 1; i--) {
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        Thread.currentThread().interrupt();
                                    }
                                    System.out.println("--------------------------------------------");
                                    System.out.println("--- Cuenta regresiva:" + (i - 1) + " -----");
                                    System.out.println("--------------------------------------------");
                                }
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    Thread.currentThread().interrupt();
                                }
                                System.out.println("\n---Listos comenzo la carrera---");
                                //Los caballos estan listos y empieza la carrera
                                Caballo1.listos();
                                Caballo2.listos();
                                Caballo3.listos();
                                Caballo4.listos();
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    Thread.currentThread().interrupt();
                                }

                                for (int i = 0; i < ronda; i++) {
                                    System.out.println("\n--- Ronda " + (i + 1) + " ---");
                                    //Se crea el objecto rando para que este al repetir genere un nnevo numero aleatorio
                                    Random hrs = new Random();
                                    //En esta parte V(Numero) es la variable que guarda el numero aleatorio y cada uno de estos se pone la variable que se guarda el numero maximo que  puede cambiar de numeros
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
                                    //Ayuda a que el ´rograma vaya mas lento y pueda ver los resultados
                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                        Thread.currentThread().interrupt();
                                    }
                                }
                                //Aqui se compara que caballo es mayor que los demas para dar el resultado del ganador de la carrera
                                if (Caballo1.getVelocidade() > Caballo2.getVelocidade() && Caballo1.getVelocidade() > Caballo3.getVelocidade() && Caballo1.getVelocidade() > Caballo4.getVelocidade()) {
                                    System.out.println("Gano el caballo :"+ Caballo1.getColor());
                                }
                                if (Caballo2.getVelocidade() > Caballo3.getVelocidade() && Caballo2.getVelocidade() > Caballo4.getVelocidade() && Caballo2.getVelocidade() > Caballo1.getVelocidade()) {
                                    System.out.println("Gano el caballo :"+Caballo2.getColor());
                                }
                                if (Caballo3.getVelocidade() > Caballo4.getVelocidade() && Caballo3.getVelocidade() > Caballo1.getVelocidade() && Caballo3.getVelocidade() > Caballo2.getVelocidade()) {
                                    System.out.println("Gano el caballo :" + Caballo3.getColor());
                                }
                                if (Caballo4.getVelocidade() > Caballo1.getVelocidade() && Caballo4.getVelocidade() > Caballo2.getVelocidade() && Caballo4.getVelocidade() > Caballo3.getVelocidade()) {
                                    System.out.println("Gano el caballo :" +  Caballo4.getColor());
                                }
                                //Se hace la pregunta si quieres comenzar la carrera otra vez
                                System.out.println("Quieres repetir la carrera? ((S)repetir / (cualquier tecla)continuar )");
                                char respuesta = sc.next().charAt(0);
                                if (respuesta == 'S' || respuesta == 's') {
                                    //Ente ayuda a reiniciar a los cabbalos y vuelvan a competir nuevamente desde cero
                                    Caballo1.reiniciar();
                                    Caballo2.reiniciar();
                                    Caballo3.reiniciar();
                                    Caballo4.reiniciar();
                                } else  {
                                    System.out.println("Saliendo de la carrera");
                                    System.out.println("Apretar una nuevamente una tecla para continuar");
                                    rondas = true;
                                    //Tiene un bug o falla que tienes que volver a poner otra vez una tecla para salir al menu
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
                            //En el modo por puntos es diferente y es que se utiliza un ciclo while y este sera detenido por la cantidad de puntos requeridos
                            //El boolean que ayuda con el ciclo
                            boolean puntos1 = false;
                            //Se hace las preguntas de cantidad de puntos y numero maximo en que el numeroa aleatorio puede variar
                            System.out.println("Escriba la cantidad de numeros requeridos para ganar(Solo numeros):");
                            if (sc.hasNextInt()) {
                                int punto = sc.nextInt();
                                System.out.println("Eliga el numero maximo que puede tener los numeros aleatorios(Solo numeros):");
                                int mAleatorio = sc.nextInt();

                                for  (int i = 4; i > 1; i--) {
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        Thread.currentThread().interrupt();
                                    }
                                    System.out.println("--------------------------------------------");
                                    System.out.println("--- Cuenta regresiva:" + (i - 1) + " -----");
                                    System.out.println("--------------------------------------------");
                                }
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    Thread.currentThread().interrupt();
                                }
                                System.out.println("\n---Listos comenzo la carrera---");
                                Caballo1.listos();
                                Caballo2.listos();
                                Caballo3.listos();
                                Caballo4.listos();
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    Thread.currentThread().interrupt();
                                }

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
                                    //Al igual que el de rondas tiene la misma funcion la diferencia es como se va a detener
                                    //Se detine con una comparacion cada caballo comprueba que sea igual o mayor a los numeros requeridos y no al ser asi sigue otra ronda
                                    //Al cumplir con los puntos uno de los caballos , el comando cambiara el booleano a true y este se detendra

                                    if (Caballo1.getVelocidade() >= punto || Caballo2.getVelocidade() >= punto || Caballo3.getVelocidade() >= punto || Caballo4.getVelocidade() >= punto) {
                                        puntos1 = true;
                                    }
                                }

                                if (Caballo1.getVelocidade() > Caballo2.getVelocidade() && Caballo1.getVelocidade() > Caballo3.getVelocidade() && Caballo1.getVelocidade() > Caballo4.getVelocidade()) {
                                    System.out.println("Gano el caballo :"+ Caballo1.getColor());
                                }
                                if (Caballo2.getVelocidade() > Caballo3.getVelocidade() && Caballo2.getVelocidade() > Caballo4.getVelocidade() && Caballo2.getVelocidade() > Caballo1.getVelocidade()) {
                                    System.out.println("Gano el caballo :"+Caballo2.getColor());
                                }
                                if (Caballo3.getVelocidade() > Caballo4.getVelocidade() && Caballo3.getVelocidade() > Caballo1.getVelocidade() && Caballo3.getVelocidade() > Caballo2.getVelocidade()) {
                                    System.out.println("Gano el caballo :" + Caballo3.getColor());
                                }
                                if (Caballo4.getVelocidade() > Caballo1.getVelocidade() && Caballo4.getVelocidade() > Caballo2.getVelocidade() && Caballo4.getVelocidade() > Caballo3.getVelocidade()) {
                                    System.out.println("Gano el caballo :" +  Caballo4.getColor());
                                }

                                System.out.println("Quieres repetir la carrera? ((S)repetir / (cualquier tecla)continuar )");
                                char respuesta = sc.next().charAt(0);
                                if (respuesta == 'S' || respuesta == 's') {
                                    Caballo1.reiniciar();
                                    Caballo2.reiniciar();
                                    Caballo3.reiniciar();
                                    Caballo4.reiniciar();
                                } else {
                                    System.out.println("Saliendo de la carrera");
                                    System.out.println("Apretar una nuevamente una tecla para continuar");
                                    puntos = true;
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

