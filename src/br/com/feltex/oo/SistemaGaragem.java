package br.com.feltex.oo;

public class SistemaGaragem {

	public static void main(String[] args) {
		Carro ferrari = new Carro();
		
		ferrari.ano = 2021;
		ferrari.cor = "Vermelho";
		ferrari.modelo = "F2021";
		ferrari.fabricante = "Ferrari";
		
		Carro gol = new Carro();
		gol.ano = 2015;
		gol.cor = "Verde";
		gol.modelo = "GOL Esportivo";
		gol.fabricante = "VW";
		

		imprimirDados(ferrari);
		imprimirDados(gol);
	}
	
	
	public static void imprimirDados(Carro carro) {
		
		System.out.println("Dados do Carro: ano " + carro.ano + " modelo: " + carro.modelo + 
				" fabricante: " + carro.fabricante);
	}

}
