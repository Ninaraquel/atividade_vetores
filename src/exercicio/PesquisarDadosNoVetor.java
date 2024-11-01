package exercicio;

import java.util.Scanner;

public class PesquisarDadosNoVetor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int vetorNumeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numero;//variável usada para armazenar o número que o usuário digitar
        
		//Exibe uma mensagem no console para o usuário digitar um número
		System.out.print("Digite o número que você deseja encontrar de 1 a 10: ");
		
		numero = scanner.nextInt();//Lê o número digitado pelo usuário

		for (int i = 0; i < vetorNumeros.length; i++) {

			if (vetorNumeros[i] == numero) {
				System.out.println("O número " + numero + " está localizado na posiçaõ: " + i);
				break;// Interrompe o loop, pois o número já foi encontrado
			}

		}
		if (numero > 10) {
			System.out.println("O número " + numero + " não foi encontrado!");
		}
		
		scanner.close();

	}
}