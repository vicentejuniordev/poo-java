import java.util.Scanner;

public class Question4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    float weight = scanner.nextFloat();
    float height = scanner.nextFloat();

    scanner.close();

    float imc = weight / (height + height);

    System.out.println(imc);

  }
}
