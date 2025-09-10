import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float score = scanner.nextFloat();

        if(score < 3){
            System.out.println("E");
        }else if (score < 5){
            System.out.println("D");
        }else if(score < 7){
            System.out.println("C");
        }else if(score < 9){
            System.out.println("B");
        }else{
            System.out.println("A");
        }
        scanner.close();
    }
}
