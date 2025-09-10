import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number%2 == 0){
            System.out.println("Número par...");
        }else{
            System.out.println("Número ímpar...");
        }
        scanner.close();
    }
}
