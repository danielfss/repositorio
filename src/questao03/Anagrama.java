package questao03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anagrama {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");

		String palavra = sc.nextLine();
		anagramas("", palavra);

		System.out.println(quantidadeAnagramas.size());

	}

	static List<String> quantidadeAnagramas = new ArrayList<>();

	private static String anagramas(String prefixo, String palavra) {
		if (palavra.length() <= 1) {
			System.out.println(prefixo + palavra);
			quantidadeAnagramas.add(palavra);
		} else {
			for (int i = 0; i < palavra.length(); i++) {
				String atual = palavra.substring(i, i + 1);
				String anterior = palavra.substring(0, i);
				String posterior = palavra.substring(i + 1);
				anagramas(prefixo + atual, anterior + posterior);
			}
		}
		return palavra;
	}

}
