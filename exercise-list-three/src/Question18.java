import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggerNumber = 0;
        int smallNumber = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            } else {
                if (number > biggerNumber) {
                    biggerNumber = number;
                }
                if (smallNumber == 0) {
                    smallNumber = number;
                } else if (number < smallNumber) {
                    smallNumber = number;
                }
            }
        }
        System.out.println("Maior número: " + biggerNumber);
        System.out.println("Menor número: " + smallNumber);
        scanner.close();
    }
}
