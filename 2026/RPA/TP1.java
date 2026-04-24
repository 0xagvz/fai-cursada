public class TP1 {
    public static void piramide(int cantidad, String simbolo, boolean saltoDeLinea) {
        for (int i = 1; i <= cantidad; i++) {
            String espacios = " ".repeat(cantidad - i);
            String simbolos = simbolo.repeat(2 * i - 1);
            
            System.out.print(espacios + simbolos);
            
            System.out.println(saltoDeLinea ? "\n" : ""); // Salto de linea opcional 
        }
    }
    public static void departamento () { // Metodo para imprimir el edificio con color rojo
        String rojo = "\u001B[31m"; // Codigo de color rojo
        String reset = "\u001B[0m"; // Codigo para resetear el color
        String edificio = """
                 _____________
                |_____________|
                |             |
                |  []     []  |
                |  []     []  |
                |_____________|
                |             |
                |     ___     |
                |    |   |    |
                |____|___|____|

                """;
        System.out.println(rojo + edificio + reset);
    }
    public static void main(String[] args) {
        piramide(5, "*", true);
        System.out.println("------------------------------");
        departamento(); 
    }
}