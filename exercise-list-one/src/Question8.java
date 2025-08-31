import java.util.Scanner;

public class Question8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    float tempF = scanner.nextFloat();

    scanner.close();

    float tempC = (tempF - 32) * (5/9);

    System.out.println(tempC);
  }
}
