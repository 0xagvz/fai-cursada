import java.util.Scanner;

public class TPCondicionales {
    static Scanner sc = new Scanner(System.in);

    public static void Punto1() {
        //En una sala técnica de la universidad se monitorea constantemente la temperatura
        //de los servidores para evitar daños en los equipos.Cuando la temperatura supera
        //cierto límite, el sistema debe mostrar una advertencia para que el personal revise la
        //refrigeración. Realizar un programa que reciba una temperatura e indique al usuario
        //si debe revisar el estado de la refrigeración. Se considera una temperatura
        //alarmante aquella que supera los 75 grados centígrados.​

        System.out.println("Ingrese la temperatura actual de los servidores: ");
        int temperatura = sc.nextInt();

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

    public static void Punto3(String nombre, String apellido, int nota1, int nota2){
        //Una materia de la Licenciatura en Sistema de Información se promociona si el
        //promedio de las notas que se obtienen en los dos parciales supera la nota 80. Leer
        //el nombre y apellido de un alumno, las notas obtenidas en los dos parciales rendidos
        //e indicar si el alumno promociona o no la materia. Si el alumno promociona, indicar
        //con qué nota lo logró.​

        float promedio = (nota1 + nota2) / 2;

        if (promedio > 80){
            System.out.println("El alumno " + nombre + " " + apellido + " promociona la materia con un promedio de " + promedio);
        } else {
            System.out.println("El alumno " + nombre + " " + apellido + " no promociona la materia con un promedio de " + promedio);
        }

    }

    public static void main(String[] args) {
        System.out.println("Ingrese el número del punto a ejecutar: ");
        int PuntoAEjecutar = sc.nextInt();
        sc.nextLine();

        switch (PuntoAEjecutar) {
            case 1 -> Punto1();
            case 2 -> Punto2();
            case 3 -> Punto3("El", "Sabueso", 85, 90);
            default -> System.out.println("No existe ese punto");
        }

        sc.close();
    }
}