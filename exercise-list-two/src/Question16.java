import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o lado 3: ");
        double lado3 = scanner.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero (3 lados iguais)");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles (2 lados iguais)");
            } else {
                System.out.println("Triângulo Escaleno (3 lados diferentes)");
            }

        } else {
            System.out.println("Os valores não formam um triângulo válido!");
        }

        scanner.close();
    }
}
