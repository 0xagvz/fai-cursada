import java.util.Random;
import java.util.Scanner;

public class TPGrupal {

    public static boolean esGol(int pateador, int arquero) {
        return pateador != arquero;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int golesJ1 = 0;
        int golesJ2 = 0;
        int posicionPateador1;
        int posicionPateador2;
        boolean hayGanador;

        //Tanda de 5 Penales
         for (int i = 1; i <= 5; i++) { 

            System.out.println("RONDA " + i);
            do {
                System.out.println("Jugador 1, elije un lugar a patear (1-3)");
                posicionPateador1 = sc.nextInt();
                if (posicionPateador1 < 1 || posicionPateador1 > 3) {
                    System.out.println("Posición inválida. Por favor, elige un número entre 1 y 3.");
                } else {
                    break;
                }
            } while (true);

            int posicionArquero = rand.nextInt(3) + 1; 

            System.out.println("El jugador pateara en: " + posicionPateador1);
            System.out.println("El arquero se tirara en: " + posicionArquero);

            boolean gol = esGol(posicionPateador1, posicionArquero);

            if (gol) {
                System.out.println("Gol del jugador 1!!");
                golesJ1++;
            } else {
                System.out.println("El arquero atajo el penal del jugador 1!!");
            }

            System.out.println("------------------------------------");

            do {
                System.out.println("Jugador 2, elije un lugar a patear (1-3)");
                posicionPateador2 = sc.nextInt();
                if (posicionPateador2 < 1 || posicionPateador2 > 3) {
                    System.out.println("Posición inválida. Por favor, elige un número entre 1 y 3.");
                } else {
                    break;
                }
            } while (true);

            posicionArquero = rand.nextInt(3) + 1;

            System.out.println("El jugador pateara en: " + posicionPateador2);
            System.out.println("El arquero se tirara en: " + posicionArquero);

            gol = esGol(posicionPateador2, posicionArquero);

            if (gol) {
                System.out.println("Gol del jugador 2!!");
                golesJ2++;
            } else {
                System.out.println("El arquero atajo el penal del jugador 2!!");
            }
         }
        
         //  Resultado después de 5 penales
        System.out.println("Resultado final:");
        System.out.println("Jugador 1: " + golesJ1 + " goles");
        System.out.println("Jugador 2: " + golesJ2 + " goles");         

         // Desempate 
         if (golesJ1 == golesJ2) {
            System.out.println("EMPATE! Vamos a muerte súbita...");

            hayGanador = false;

            do{
                do {
                    System.out.println("Jugador 1, elije un lugar a patear (1-3)");
                    posicionPateador1 = sc.nextInt();
                    if (posicionPateador1 < 1 || posicionPateador1 > 3) {
                        System.out.println("Posición inválida. Por favor, elige un número entre 1 y 3.");
                    } else {
                        break;
                    }
                } while (true);

                int posicionArquero = rand.nextInt(3) + 1; 

                System.out.println("El jugador pateara en: " + posicionPateador1);
                System.out.println("El arquero se tirara en: " + posicionArquero);

                boolean golp1 = esGol(posicionPateador1, posicionArquero);

                if (golp1) {
                    System.out.println("Gol del jugador 1!!");
                } else {
                    System.out.println("El arquero atajo el penal del jugador 1!!");
                }

                System.out.println("------------------------------------");

                do {
                    System.out.println("Jugador 2, elije un lugar a patear (1-3)");
                    posicionPateador2 = sc.nextInt();
                    if (posicionPateador2 < 1 || posicionPateador2 > 3) {
                        System.out.println("Posición inválida. Por favor, elige un número entre 1 y 3.");
                    } else {
                        break;
                    }
                } while (true);

                posicionArquero = rand.nextInt(3) + 1;

                System.out.println("El jugador pateara en: " + posicionPateador2);
                System.out.println("El arquero se tirara en: " + posicionArquero);

                boolean golp2 = esGol(posicionPateador2, posicionArquero);

                if (golp2) {
                    System.out.println("Gol del jugador 2!!");
                } else {
                    System.out.println("El arquero atajo el penal del jugador 2!!");
                }
                
                if (golp1 && !golp2) {
                    System.out.println("--- Jugador 1 gana en muerte súbita! ---");
                    hayGanador = true;
                } else if (!golp1 && golp2) {
                    System.out.println("--- Jugador 2 gana en muerte súbita! ---");
                    hayGanador = true;
                } else {
                    System.out.println("Siguen empatados, otra ronda...");
                }

            }while (!hayGanador);
        } else if (golesJ1 > golesJ2) {
            System.out.println("--- Gana el Jugador 1! ---");
        } else {
            System.out.println("--- Gana el Jugador 2! ---");
        }

    }

}