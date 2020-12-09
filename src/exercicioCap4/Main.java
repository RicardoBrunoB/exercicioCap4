package exercicioCap4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double preco1, preco2;
		
		System.out.println("Digite o codigo do primeiro produto: ");
		cod1 = sc.nextInt();
		System.out.println("Digite a quantidade do primeiro produto: ");
		qtd1 = sc.nextInt();
		System.out.println("Digite o preco do primeiro produto: ");
		preco1 = sc.nextDouble();
		
		System.out.println("Digite o codigo do segundo produto: ");
		cod2 = sc.nextInt();
		System.out.println("Digite o quantidade do segundo produto: ");
		qtd2 = sc.nextInt();
		System.out.println("Digite o preco do segundo produto: ");
		preco2 = sc.nextDouble();
		
		double valor = qtd1 * preco1 + qtd2 * preco2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor);
		
		sc.close();
	}

}
