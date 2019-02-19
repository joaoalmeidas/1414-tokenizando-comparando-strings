import java.util.Scanner;

public class Tokenizacao {

	public static void main(String[] args) {
		
		String frase;
		String[] token;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira uma frase:");
		frase = input.nextLine();
		
		token = frase.split(" ");
		
		System.out.println("Palavras da frase que iniciam com \"B\":");
		
		for(String palavra : token) {
			
			if(palavra.startsWith("b") || palavra.startsWith("B")) {
				
				System.out.println(palavra);
				
			}
			
		}
		
	}

}
