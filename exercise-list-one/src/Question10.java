import java.util.Scanner;

public class Question10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    float temp = scanner.nextFloat();
    float speed = scanner.nextFloat();

    scanner.close();

    float dist = temp * speed;

    float useCombust = dist / 16;

    System.out.println(useCombust);
  }
}
