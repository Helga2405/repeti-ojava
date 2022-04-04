package laçofor;

import java.util.Scanner;

public class dowhil2 {
	public static void main(String[] arg) {
		
		int num, resto, soma= 0, cont = 0, media;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("digite um numero: ");
			num= ler.nextInt();
			resto = num % 3;
			
			if (resto== 0 && num >0) {
				soma += num;
				cont++;
			
			}
		}	while (num != 0);
		
		media = soma / cont;
		System.out.println("a media dos numeros digitados é:" + media);
			
		
	}

}
