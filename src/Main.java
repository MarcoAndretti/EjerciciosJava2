import java.util.Scanner;

public class Main {
    private Scanner scanner;

    public Main() {
        this.scanner = new Scanner(System.in);
    }

    // Métodos utilizando estructura de control: if-else
    public void determinarNumero() {
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }

    public void verificarParImpar() {
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }

    public void mostrarMayorDeTres() {
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        System.out.println("El número mayor es: " + mayor);
    }

    public void determinarBisiesto() {
        System.out.print("Ingrese un año: ");
        int año = scanner.nextInt();
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("El año no es bisiesto.");
        }
    }

    // Métodos utilizando estructura de control: bucles while
    public void imprimirNumerosAscendentes() {
        int i = 1;
        while (i <= 20) {
            System.out.println(i);
            i++;
        }
    }

    public void imprimirNumerosHasta() {
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }

    public void sumarNumerosPositivos() {
        int suma = 0;
        int numero;
        do {
            System.out.print("Ingrese un número (negativo para terminar): ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                suma += numero;
            }
        } while (numero >= 0);
        System.out.println("La suma de los números positivos es: " + suma);
    }

    public void generarFibonacci() {
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        while (a <= n) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + a;
        }
        System.out.println();
    }

    // Métodos utilizando estructura de control: bucles for
    public void imprimirNumerosPares() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }

    public void mostrarTablaMultiplicar() {
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public void sumarParesHasta() {
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("La suma de los números pares es: " + suma);
    }

    public void calcularFactorial() {
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);
    }

    public static void main(String[] args) {
        Main ejercicios = new Main();

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Determinar si un número es positivo, negativo o cero");
            System.out.println("2. Verificar si un número es par o impar");
            System.out.println("3. Mostrar el mayor de tres números");
            System.out.println("4. Determinar si un año es bisiesto");
            System.out.println("5. Imprimir números del 1 al 20");
            System.out.println("6. Imprimir números desde 1 hasta un número dado");
            System.out.println("7. Sumar números positivos hasta ingresar uno negativo");
            System.out.println("8. Generar secuencia de Fibonacci hasta un número dado");
            System.out.println("9. Imprimir números pares del 2 al 20");
            System.out.println("10. Mostrar tabla de multiplicar de un número");
            System.out.println("11. Sumar números pares hasta un número dado");
            System.out.println("12. Calcular el factorial de un número");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ejercicios.determinarNumero();
                    break;
                case 2:
                    ejercicios.verificarParImpar();
                    break;
                case 3:
                    ejercicios.mostrarMayorDeTres();
                    break;
                case 4:
                    ejercicios.determinarBisiesto();
                    break;
                case 5:
                    ejercicios.imprimirNumerosAscendentes();
                    break;
                case 6:
                    ejercicios.imprimirNumerosHasta();
                    break;
                case 7:
                    ejercicios.sumarNumerosPositivos();
                    break;
                case 8:
                    ejercicios.generarFibonacci();
                    break;
                case 9:
                    ejercicios.imprimirNumerosPares();
                    break;
                case 10:
                    ejercicios.mostrarTablaMultiplicar();
                    break;
                case 11:
                    ejercicios.sumarParesHasta();
                    break;
                case 12:
                    ejercicios.calcularFactorial();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
            System.out.println();
        } while (opcion != 0);

        scanner.close();
    }
}
