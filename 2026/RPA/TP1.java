public class TP1 {
    public static void piramide(int cantidad, String simbolo) {
        for (int i = 1; i <= cantidad; i++) {
            String espacios = " ".repeat(cantidad - i);
            String simbolos = simbolo.repeat(2 * i - 1);
            System.out.println(espacios + simbolos);
        }
    }

    public static void main(String[] args) {
        piramide(5, "*");
    }
}