package br.com.feltex.entrada.dados;

import java.util.Scanner;

public class EntradaDadosScanner {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = entrada.next();
		
		System.out.println("Nome do usuario: " + nome);
		
		
		System.out.println("Digite sua idade:");
		int idade = entrada.nextInt();
		System.out.println("Idade informada: " + idade);

	}

}
