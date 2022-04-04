package laçofor;

import java.util.Scanner;

public class dowhil {
	public static void main(String[] args) {
		int num, soma = 0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("digite um numero: ");
			num = ler.nextInt();
			soma += num;
		  } while (num != 0);
			System.out.println("a soma dos numeros digitados é: " + soma);
		}
	

}
