package laçofor;

import java.util.Scanner;

public class exerciciowhile {
public static void main(String [] args) {
	
	int idade, cont21 = 0, cont50 = 0;
	Scanner ler = new Scanner(System.in);
	System.out.println("Digite sua idade, amigo");
	idade= ler.nextInt();
	
	while (idade!= -99) {
		if (idade < 21) {
			cont21++;
		}
		if (idade > 50) {
			cont50++;
		}
		System.out.println("Digite sua idade, amigo");
		idade= ler.nextInt();
		
	}
	System.out.println("o total de pessoas com menos de 21 é:" +cont21);
	System.out.println("o total de pessoas com mais de 50 é:" +cont50);
}
}
