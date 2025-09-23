import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float area = 0;
        while (true){
            String name = scanner.next();
            float largura = scanner.nextFloat();
            float comprimento = scanner.nextFloat();
            area = largura * comprimento;
            System.out.println(name + " -> " + area + " m²");
            System.out.println("Você quer calcular a área de outro cômodo? (S/N)");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("N")) {
                break;
            }
        }
        scanner.close();
    }
}
