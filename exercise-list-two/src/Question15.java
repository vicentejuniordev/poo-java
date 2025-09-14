import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float valueShop = scanner.nextFloat();

        if(valueShop > 100){
            valueShop = (float) (valueShop - (valueShop * 0.10));
            System.out.println("Valor da compra é: " + valueShop);
        }else{
            System.out.println("Valor da compra é: " + valueShop);
            
        }
        scanner.close();
    }
}
