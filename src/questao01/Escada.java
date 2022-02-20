package questao01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Escada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> degraus = new ArrayList<>();

		System.out.println("Digite o número de degraus: ");
		int degrau = sc.nextInt();

		for (int i = 0; i < degrau; i++) {
			degraus.add(" ".repeat(degrau - i) + "*".repeat(i + 1));
			System.out.println(degrau);
		}

		for (String d : degraus) {
			System.out.println(d);
		}
	}
}
