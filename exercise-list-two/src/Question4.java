import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float score = scanner.nextFloat();

        if(score >= 6){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        scanner.close();
    }
}
