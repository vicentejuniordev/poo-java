import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do saque (múltiplo de 10): ");
        int valor = scanner.nextInt();

        if (valor % 10 != 0 || valor <= 0) {
            System.out.println("Valor inválido! O saque deve ser um múltiplo de 10.");
        } else {
            int notas50 = valor / 50;
            valor %= 50;

            int notas20 = valor / 20;
            valor %= 20;

            int notas10 = valor / 10;

            System.out.println("Notas entregues:");
            if (notas50 > 0) {
                System.out.println(notas50 + " nota(s) de 50");
            }
            if (notas20 > 0) {
                System.out.println(notas20 + " nota(s) de 20");
            }
            if (notas10 > 0) {
                System.out.println(notas10 + " nota(s) de 10");
            }
        }

        scanner.close();
    }
}
