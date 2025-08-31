import java.util.Scanner;

public class Question5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    float producctPrice = scanner.nextFloat();
    float descPercent = scanner.nextFloat();

    scanner.close();

    float valueWithDesc = producctPrice * (descPercent/100);
    float newValue = producctPrice - valueWithDesc;

    System.out.println(newValue);
  }
}
