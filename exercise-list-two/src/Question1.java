import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age >= 18){
            System.out.println("Maior de idade...");
        }else{
            System.out.println("Menor de idade...");
        }

        scanner.close();
    }
}
