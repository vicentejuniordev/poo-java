import java.util.Scanner;

public class Question19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o dividendo: ");
		int dividendo = scanner.nextInt();
		System.out.print("Digite o divisor: ");
		int divisor = scanner.nextInt();

		if (divisor == 0) {
			System.out.println("Divisão por zero não é permitida.");
			scanner.close();
			return;
		}

		int quociente = 0;
		int sinal = 1;
		if ((dividendo < 0 && divisor > 0) || (dividendo > 0 && divisor < 0)) {
			sinal = -1;
		}

		int dividendoTemp = dividendo;
		int divisorTemp = divisor;

		// Trabalha apenas com valores positivos para o laço
		if (dividendo < 0) dividendoTemp = -dividendo;
		if (divisor < 0) divisorTemp = -divisor;

		while (dividendoTemp >= divisorTemp) {
			dividendoTemp -= divisorTemp;
			quociente++;
		}

		quociente = quociente * sinal;
		System.out.println("O quociente inteiro é: " + quociente);
		scanner.close();
	}
}
