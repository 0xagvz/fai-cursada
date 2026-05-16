import java.util.Random;

public class TPFinal {
    public static boolean esGol(int pateador, int arquero) { // Definicion de la funcion para determinar el resultado del penal
        return pateador != arquero; // Si pateaedor = arquero = true, si pateador != arquero = false
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int posicionPateador = rand.nextInt(3) + 1; // random entre 1 y 3 para la posicion del pateador
        int posicionArquero = rand.nextInt(3) + 1; // random entre 1 y 3 para la posicion del arquero

        // Se muestra el resultado de ambas posiciones
        System.out.println("-----------------------------------------------------");
        System.out.println("Posicion del pateador: " + posicionPateador); 
        System.out.println("Posicion del arquero: " + posicionArquero);
        System.out.println("-----------------------------------------------------");

        // Se canta el resultado
        boolean gol = esGol(posicionPateador, posicionArquero);
        if (gol) {
            System.out.println("gol!!!");
        } else {
            System.out.println("barovero, barovero, barovero, la atajo el arquero!!!");
        }
        System.out.println("-----------------------------------------------------");
    }
}