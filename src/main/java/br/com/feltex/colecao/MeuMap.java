package br.com.feltex.colecao;

import java.util.HashMap;

public class MeuMap {

	public static void main(String[] args) {
		var meuMap = new HashMap<Integer, String>();
		
		meuMap.put(1, "um");
		meuMap.put(2, "dois");
		meuMap.put(3, "três");
		meuMap.put(10, "dez");
		
		System.out.println(meuMap.get(1));
		System.out.println(meuMap.get(10));
		
		System.out.println(meuMap);
		
		meuMap.put(1, "um - valor alterado");
		System.out.println(meuMap);
		meuMap.remove(2);
		
		System.out.println(meuMap);

	}

}
