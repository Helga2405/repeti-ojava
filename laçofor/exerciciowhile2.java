package la�ofor;

import java.util.Scanner;

public class exerciciowhile2 {
	public static void main(String [] args) {
		int idade, genero, opcao;
		int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0,  contInt = 0;
		
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		idade= ler.nextInt();
		
		System.out.println("Digite seu genero diante das op��es: ");
		System.out.println("(1 - femenino / 2 - masculino / 3 - outros - ");
		genero= ler.nextInt();
		
		System.out.println("Digite sua opcao diante das op��es: ");
		System.out.println("(1 - calma / 2 - nervosa / 3 - agressiva - ");
		opcao= ler.nextInt();
		
		if (opcao == 1) {
			cont1++;
		}
		if (genero == 1 && opcao == 2) {
			cont2++;
		}
		if (genero == 2 && opcao == 3) {
			cont3++;
		}
		if (genero == 3 && opcao == 1) {
			cont4++;
		}
		if (idade > 40 && opcao == 2) {
			cont5++;
		}
		if (idade < 18 && opcao == 1) {
			cont6++;
		}
		contInt++;
		
		while (contInt < 150 && idade>=1 && genero>=1 && genero<=3 && opcao>=1 && opcao<=3)
			{
			contInt++;
			
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Digite seu sexo de acordo com as op��es abaixo: ");
			System.out.print("(1 - Feminino | 2 - Masculino | 3 - Outro) - ");
			genero = ler.nextInt();
			
			System.out.println("Que tipo de pessoa voc� �? Escolha dentre as op��es abaixo:");
			System.out.print("(1 - Calma | 2 - Nervosa | 3 - Agressiva) - ");
			opcao = ler.nextInt();
			
			if (opcao == 1) {
				cont1++;
			}
			if (genero == 1 && opcao == 2) {
				cont2++;
			}
			if (genero == 2 && opcao == 3) {
				cont3++;
			}
			if (genero == 3 && opcao == 1) {
				cont4++;
			}
			if (idade > 40 && opcao == 2) {
				cont5++;
			}
			if (idade < 18 && opcao == 1) {
				cont6++;
			}
			
		}
	System.out.println("O n�mero de pessoas calmas �: " + cont1);
	System.out.println("O n�mero de mulheres nervosas �: " + cont2);
	System.out.println("O n�mero de homens agressivos: " + cont3);
	System.out.println("O n�mero de outros calmos: " + cont4);
	System.out.println("O n�mero de pessoas nervosas com mais de 40 anos: " + cont5);
	System.out.println("O n�mero de pessoas calmas com menos de 18 anos: " + cont6);
	}


		
		
	}


