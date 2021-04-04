import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    private static double a;
    private static double b;
    static Calculadora calc1 = new Calculadora();

    public static void main(String[] args){
        System.out.println("Bienvenido a la calculadora");
        cambiarValores();
        Outer1:
        while (true) {
            System.out.println("A: " + a + " B: " + b + " ¿Que desea hacer?\n");

            System.out.println("1. Sumar los valores de A y B");
            System.out.println("2. Restar los valores de A y B");
            System.out.println("3. Multiplicar los valores de A y B");
            System.out.println("4. Dividir los valores de A y B");
            System.out.println("5. Cambiar los valores de A y B");
            System.out.println("0. Salir");

            String opcion = teclado.nextLine();
            switch (opcion) {
                case "1":
                    hacerSuma();
                    break;
                case "2":
                    hacerResta();
                    break;
                case "3":
                    hacerMultiplicación();
                    break;
                case "4":
                    hacerDivision();
                    break;
                case "5":
                    cambiarValores();
                    break;
                case "0":
                    break Outer1;
                default:
                    break;
            }
        }

    }

    public static void cambiarValores() {
       try {
           System.out.println("Ingrese el valor de A ");
           a = teclado.nextDouble();
           System.out.println("Ingrese el valor de B ");
           b = teclado.nextDouble();
       }catch (Exception e) {
           System.out.println("valor inválido");
           cambiarValores();
       }
    }
    public static void hacerSuma (){
        double resultado = calc1.sumar(a,b);
        System.out.println(a+ " + " +b+ " = " +resultado);

    }
    public static void hacerResta() {
        double resultado = calc1.restar(a,b);
        System.out.println(a+ " - " +b+ " = " +resultado);
    }

    public static void hacerMultiplicación() {
        double resultado = calc1.multiplicar(a,b);
        System.out.println(a+ " * " +b+ " = " +resultado);
    }

    public static void hacerDivision() {
        if (b == 0) {
            System.out.println("Error, el valor no es válido, debe ser distinto de 0");
            return;

        }
        double resultado = calc1.dividir(a, b);
        System.out.println(a + " / " + b + " = " + resultado);

    }






}
