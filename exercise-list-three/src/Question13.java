import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        int sum = 0;
        int average = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++){
            int num = scanner.nextInt();
            sum += num;
        }
        average = sum / 10;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        scanner.close();
    }
}
