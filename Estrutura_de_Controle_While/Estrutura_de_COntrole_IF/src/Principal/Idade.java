package Principal;

import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		
	
	Scanner scanner = new Scanner(System.in);
	int idade;
	
	System.out.println("Digite sua idade:");
	 idade = scanner.nextInt(); 
	 
	 if (idade >= 18) {
		 System.out.println("Voc� � maior de idade.");
	 }else {
		 System.out.println("Voc� � menor de idade.");
	 }
	 

 }

}
