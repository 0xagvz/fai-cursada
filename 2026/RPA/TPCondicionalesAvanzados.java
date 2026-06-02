import java.util.Scanner;

public class TPCondicionalesAvanzados {
    static Scanner sc = new Scanner(System.in);

    public static void Punto1(){
        //Desarrollar un programa que reciba un número entero. Se debe evaluar si el número
        //ingresado es cero. Si no se trata del valor cero, determinar si es un número positivo
        //o negativo. En caso de ser positivo, verificar si se trata de un número par o impar. Al
        //finalizar el programa, debe mostrar el diagnóstico completo (ej: "El número es
        //distinto de cero, es negativo e impar" o “El número es cero”).

        System.out.println("Ingrese un número entero: ");
        int numero = sc.nextInt();

        if (numero == 0){
            System.out.println("El numero es 0");
        } else if (numero > 0){
            if (numero % 2 == 0){
                System.out.println("El numero es positivo, y par");
            } else {
                System.out.println("El numero es positivo, e impar");
            }
        } else {
            System.out.println("El numero es negativo");
        }
    }

    public static void Punto2(){
        //Crear un sistema de inscripción a una beca, donde se ingresa la edad del postulante
        //y su promedio actual (de 0 a 100).
            //●​ Si es mayor o igual a 18 años, se debe evaluar su promedio actual: Si tiene
            //80 o más, entonces queda admitido, pero si es menor a 80 debe quedar en
            //lista de espera.
            //●​ Si es menor de 18 años, se evalúa el promedio, pero esta vez sólo puede
            //quedar admitido condicional y únicamente si tiene 90 o más. En caso
            //contrario debe quedar rechazado.
        
        System.out.println("Ingrese la edad del postulante: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese el promedio actual del postulante (de 0 a 100): ");
        int promedio = sc.nextInt();

        if (edad >= 18){
            if (promedio >= 80){
                System.out.println("El postulante queda admitido");
            } else {
                System.out.println("El postulante queda en lista de espera");
            }
        } else {
            if (promedio >= 90){
                System.out.println("El postulante queda admitido condicional");
            } else {
                System.out.println("El postulante queda rechazado");
            }
        }
    }

    public static void main(String[] args){
        System.out.println("Ingrese el número del punto a ejecutar: ");
        int punto = sc.nextInt();
        switch (punto) {
            case 1 -> Punto1();
            case 2 -> Punto2();
            default -> System.out.println("Punto no válido");
        }
    }
}