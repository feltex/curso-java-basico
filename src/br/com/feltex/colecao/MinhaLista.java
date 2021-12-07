package br.com.feltex.colecao;

import java.util.ArrayList;
import java.util.Collections;

public class MinhaLista {

	public static void main(String[] args) {
		var listaNomes = new ArrayList<String>();
		listaNomes.add("Jose");
		listaNomes.add("Maria");
		listaNomes.add("Joao");
		
		System.out.println(listaNomes);
		Collections.sort(listaNomes);
		System.out.println(listaNomes);
		
		// 0,1, 2...
		listaNomes.remove(0);
		System.out.println(listaNomes);
		
		System.out.println("A lista contém o nome Maria? " + listaNomes.contains("Maria"));
		
		listaNomes.clear();
		
		System.out.println(listaNomes);
		listaNomes.add("Ana");
		listaNomes.add("Ana");
		
		System.out.println(listaNomes);
		
	}
}
