import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if(number1 > number2){
            System.out.println("O numero maior é: "+ number1);
        }else{
            System.out.println("O numero maior é: "+ number2);
        }
        scanner.close();
    }
    
}
