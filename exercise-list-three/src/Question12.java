import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fat = 1;
        for(int i = 1; i <=15; i++){
            int number = scanner.nextInt();

            for(int j = number; j > 0; j--){
                fat *= j;   
            }
            System.out.println(fat);
            fat = 1;
        }
        scanner.close();
    }
}
