package laçofor;

import java.util.Scanner;

public class forone {
public static void main(String[] args) {
	int num,contpar=0, contimpar=0;
	
	Scanner ent = new Scanner(System.in);
	
	for (int i= 1 ; i<=10 ; i++)
	{
		System.out.println("digite um numero");
		num= ent.nextInt();
		
		if (num%2==0)
		{
			contpar++;
		}
		if (num%2==1)
		{
			contimpar++;
		}
	
			
	}
	System.out.println("foi digitado "+contpar+" numeros pares e \n"+contimpar+" numeros impares");
	System.out.println("Fim");
	
}
}
