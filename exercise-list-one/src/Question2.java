import java.util.Scanner;

public class Question2 {
  public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in);
    float measures = 1;
    for(int i = 0; i < 2; i++){
      float measure = scanner.nextFloat();
      measures *= measure;
    }
    scanner.close();

    float area = measures/2;

    System.out.println(area);

  }
}