import java.util.Scanner;

public class Question3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    float realValue = scanner.nextFloat();
    float dolarValue = scanner.nextFloat();

    scanner.close();

    float cotation = realValue / dolarValue;

    System.out.println(cotation);
  }
}
