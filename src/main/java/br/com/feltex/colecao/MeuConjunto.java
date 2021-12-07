package br.com.feltex.colecao;

import java.util.Collections;
import java.util.HashSet;

public class MeuConjunto {

	public static void main(String[] args) {
		var conjuntoNomes = new HashSet<String>();
		conjuntoNomes.add("Jose");
		conjuntoNomes.add("Maria");
		conjuntoNomes.add("Maria");
		conjuntoNomes.add("Ana");
		
		System.out.println(conjuntoNomes);
		//Collections.sort(conjuntoNomes);  Não funciona com Set/HashSet
		
		conjuntoNomes.remove("Maria");
		System.out.println(conjuntoNomes);
		
	

	}

}
