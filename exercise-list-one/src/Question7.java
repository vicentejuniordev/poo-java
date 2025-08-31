import java.util.Scanner;

public class Question7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    float valPrest = scanner.nextFloat();
    int temp = scanner.nextInt();
    float taxa = scanner.nextFloat();
    scanner.close();

    float prest = valPrest + (valPrest + (taxa/ 100) * temp);

    System.out.println(prest);
  }
}
