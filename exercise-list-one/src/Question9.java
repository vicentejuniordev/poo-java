import java.util.Scanner;

public class Question9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    float baseMaior = scanner.nextFloat();
    float baseMenor = scanner.nextFloat();
    float alt = scanner.nextFloat();

    scanner.close();

    float area = ((baseMaior + baseMenor) * alt)/2;

    System.out.println(area);
  }
}
