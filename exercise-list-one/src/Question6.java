import java.util.Scanner;

public class Question6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    float comp = scanner.nextFloat();
    float larg = scanner.nextFloat();
    float alt = scanner.nextFloat();

    scanner.close();

    float vol = comp * alt * larg;

    System.out.println(vol);
  }
}
