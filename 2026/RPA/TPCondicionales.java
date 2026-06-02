import java.util.Scanner;


public class TPCondicionales {
    static Scanner sc = new Scanner(System.in);

    public static void Punto1(int temperatura) {
        //En una sala técnica de la universidad se monitorea constantemente la temperatura
        //de los servidores para evitar daños en los equipos.Cuando la temperatura supera
        //cierto límite, el sistema debe mostrar una advertencia para que el personal revise la
        //refrigeración. Realizar un programa que reciba una temperatura e indique al usuario
        //si debe revisar el estado de la refrigeración. Se considera una temperatura
        //alarmante aquella que supera los 75 grados centígrados.​

        if (temperatura > 75){
            System.out.println("Se debe revisar el estado de la refrigeración");
        } else {
            System.out.println("La temperatura es normal");
        }
    }

    public static void Punto2(){
        // En el comedor de la UNCO los estudiantes pueden acceder al almuerzo del día con
        // su carnet de estudiante. El día de hoy hay ñoquis con queso y el precio es de $9000.
        // Aquellos que tengan el carnet, gozan de un descuento del 25% en el bono de
        // almuerzo. Realizar un programa que pida al usuario si cuentan con el carnet (S para
        // si y N para no) y muestre un mensaje por pantalla con el valor del almuerzo.​

        System.err.println("¿Cuenta con el carnet de estudiante? (S/N): ");

        String TieneCarnet = sc.nextLine();

        switch (TieneCarnet) {
            case "S", "s" -> System.out.println("El valor del almuerzo es de $6750");
            case "N", "n" -> System.out.println("El valor del almuerzo es de $9000");
            default -> System.out.println("Opción no válida. Por favor ingrese S o N.");
        }

    }

    public static void main(String[] args) {
        int PuntoAEjecutar = sc.nextInt();

        switch (PuntoAEjecutar) {
            case 1 -> Punto1(80);
            case 2 -> Punto2();
            default -> System.out.println("No existe ese punto");
        }

        sc.close();
    }
}