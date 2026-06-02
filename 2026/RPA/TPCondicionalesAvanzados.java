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

    public static void main(String[] args){
        System.out.println("Ingrese el número del punto a ejecutar: ");
        int punto = sc.nextInt();
        switch (punto) {
            case 1 -> Punto1();
            default -> System.out.println("Punto no válido");
        }
    }
}