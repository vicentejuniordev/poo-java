import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int average = 0;
        int inputQuantity = 0;

        while(true){
            int number = scanner.nextInt();
            if(number < 0){
                break;
            }else{
                sum += number;
                inputQuantity += 1;
            }
            
        }

        average = sum / inputQuantity;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Input Quantity: " + inputQuantity);
        scanner.close();
    }
    
}