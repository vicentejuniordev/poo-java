import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println(age < 18? "Menor de idade":"Maior de idade");
        scanner.close();
    }
}
