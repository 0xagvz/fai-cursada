import java.util.Random;
import java.util.Scanner;

public class TPGrupal {

    public static boolean esGol(int pateador, int arquero) {
        return pateador != arquero;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el lugar a patear");
        int posicionPateador = sc.nextInt();

        while (posicionPateador < 1 || posicionPateador > 3) {
            System.out.println("Ingrese un numero entre 1 y 3");
            posicionPateador = sc.nextInt();
        }

        int posicionArquero = rand.nextInt(3) + 1;

        System.out.println("Posicion del pateador: " + posicionPateador);
        System.out.println("Posicion del arquero: " + posicionArquero);

        boolean gol = esGol(posicionPateador, posicionArquero);

        if (gol) {
            System.out.println("Es Gol");
        } else {
            System.out.println("No Es Gol");
        }

        sc.close();
    }
}