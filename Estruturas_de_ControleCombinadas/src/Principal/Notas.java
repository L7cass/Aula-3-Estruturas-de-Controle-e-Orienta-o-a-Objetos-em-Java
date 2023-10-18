package Principal;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int nota;
		System.out.println("Digite sua nota de 0 a 100: ");
		nota = scanner.nextInt();
		
		if(nota >= 70){
			System.out.println("Aprovado");
			}
		else if (nota >= 40){
			System.out.println("Recuperação");
		}
		else{
			System.out.println("Reprovado");
		}
		

	}

}
