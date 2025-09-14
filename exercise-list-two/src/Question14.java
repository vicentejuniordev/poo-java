import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float score1 = scanner.nextFloat();
        float score2 = scanner.nextFloat();
        float media = (score1 + score2)/2;

        System.out.println(media>=6? "Aprovado":"Reprovado");
        scanner.close();
    }
}
