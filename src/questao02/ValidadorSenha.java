package questao02;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorSenha {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        if(validaSenha(senha)) {
        	System.out.println("Senha cadastrada com sucesso!");
        } else {
        	System.out.println("A senha informada não atende aos requisitos mínimos."
        			+ "\nDeve possuir no mínimo 6 caracteres."
        			+ "\nDeve conter no mínimo 1 número."
        			+ "\nDeve conter no mínimo 1 letra maiúscula."
        			+ "\nDeve conter no mínimo 1 letra minúscula."
        			+ "\nDeve conter no mínimo 1 caractere especial. Ex: !@#$%^&*()-+ ");
        }
        
	}
	
	public static boolean validaSenha(String senha) {
		
		// Mínimo 6 caracteres e no máximo 255 caracteres
		String regex = "^(?=.*[A-Z])(?=.*[!#@$%&])(?=.*[0-9])(?=.*[a-z]).{6,255}$";
		
		Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(senha);

        return matcher.matches();
		
	}
}
