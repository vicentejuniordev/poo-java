import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float temp = scanner.nextFloat();
        if(temp > 30){
            System.out.println("Está calor...");
        }else{
            System.out.println("Temperatura normal...");
        }
        scanner.close();
    }
}
