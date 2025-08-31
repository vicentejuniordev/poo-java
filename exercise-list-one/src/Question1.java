import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) throws Exception {
        //Uso da classe Scanner, classe que possibilita ao usúario inserir valores no terminal.
        Scanner scanner = new Scanner(System.in);
        float score = 0;
        //Laço de reptição para pegar os valores do usuário.
        for(int i = 0;i < 4 ; i ++){
            float userInput = scanner.nextFloat();
            score += userInput;
        }
        scanner.close(); //Sempre fechar o scannerr, pois diminui os recursos do sistema.

        float media = score/4;
        System.out.println(media);



    }
}
