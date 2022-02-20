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
        	System.out.println("A senha informada n�o atende aos requisitos m�nimos."
        			+ "\nDeve possuir no m�nimo 6 caracteres."
        			+ "\nDeve conter no m�nimo 1 n�mero."
        			+ "\nDeve conter no m�nimo 1 letra mai�scula."
        			+ "\nDeve conter no m�nimo 1 letra min�scula."
        			+ "\nDeve conter no m�nimo 1 caractere especial. Ex: !@#$%^&*()-+ ");
        }
        
	}
	
	public static boolean validaSenha(String senha) {
		
		// M�nimo 6 caracteres e no m�ximo 255 caracteres
		String regex = "^(?=.*[A-Z])(?=.*[!#@$%&])(?=.*[0-9])(?=.*[a-z]).{6,255}$";
		
		Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(senha);

        return matcher.matches();
		
	}
}
