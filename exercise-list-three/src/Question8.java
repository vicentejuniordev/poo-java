import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        int e = scanner.nextInt();

        int r = 1;
        for(int i = 1; i <= e;i++){
            r *= b;
        }
        System.out.println(r);
        scanner.close();
    }
}
