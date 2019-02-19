import java.util.Scanner;

public class Tokenizacao {

	public static void main(String[] args) {
		
		String frase;
		String[] token;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira uma frase:");
		frase = input.nextLine();
		
		token = frase.split(" ");
		
		System.out.println("Palavras da frase que terminam com \"ED\":");
		
		for(String palavra : token) {
			
			if(palavra.endsWith("ED") || palavra.endsWith("ed") || palavra.endsWith("Ed") || palavra.endsWith("eD")) {
				
				System.out.println(palavra);
				
			}
			
		}
		
		
		
	}

}
