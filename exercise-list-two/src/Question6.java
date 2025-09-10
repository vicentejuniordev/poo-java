import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age <= 12){
            System.out.println("Criança");
        }else if(age > 12 && age <= 17){
            System.out.println("Adolescente");
        }else if(age > 17 && age <= 59){
            System.out.println("Adulto");
        }else{
            System.out.println("Idoso");
        }
        scanner.close();
    }
}
