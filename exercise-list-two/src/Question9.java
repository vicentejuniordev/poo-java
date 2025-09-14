import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Cadastrar Usuário");
        System.out.println("2 - Listar Usuários");
        System.out.println("3 - Excluir Usuário");
        System.out.println("4 - Sair");
        int opt = scanner.nextInt();
        switch (opt) {
            case 1:
             System.out.println("Escolheu Cadastrar Usuário");
             break;
            case 2:
             System.out.println("Escolheu Listar Usuários");
             break;
            case 3:
             System.out.println("Escolheu Excluir Usuário");
             break;
            case 4: 
             System.out.println("Escolheu Sai...");
             break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        scanner.close();

    }
}
