import java.util.Scanner;

public class TP2 {
    // Declaramos el metodo para generar el recibo
    public static String generarRecibo(String producto, int precioUnitario, int cantidad) {
        int precioTotal = precioUnitario * cantidad;
        return "Producto: " + producto + "\nPrecio Unitario: " + precioUnitario + "\nCantidad: " + cantidad + "\nTotal: $" + precioTotal;
    }

    public static void main(String[] args) {
        // Input
        Scanner input = new Scanner(System.in);
        
        // Input producto
        System.out.print("Producto: ");
        String producto = input.nextLine();
        if (producto.isEmpty()) {
            System.out.println("Error: El producto no puede estar vacio");
            return;
        }
        producto = producto.substring(0, 1).toUpperCase() + producto.substring(1);

        // Input precio unitario
        System.out.print("Precio unitario: ");
        float precioUnitario = input.nextFloat();
        if (precioUnitario <= 0) {
            System.out.println("Error: El precio unitario debe ser mayor a 0");
            return;
        }

        // Input cantidad
        System.out.print("Cantidad: ");
        int cantidad = input.nextInt();
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor a 0");
            return;
        }

        // LLamamos el metodo para generar el recibo
        System.out.println("-----------------------------------------------------");
        System.out.println(generarRecibo(producto, (int) precioUnitario, cantidad));
        System.out.println("-----------------------------------------------------");
    }
}