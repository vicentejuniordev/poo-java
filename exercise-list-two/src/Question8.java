import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if(number1 > number2 && number1 > number3){
            System.out.println("O maior número é: " + number1);
        }else if (number2 > number1 && number2 > number3){
            System.out.println("O maior número é: " + number2);
        }else{
            System.out.println("O maior número é: " + number3);
        }
        scanner.close();
    }
}
