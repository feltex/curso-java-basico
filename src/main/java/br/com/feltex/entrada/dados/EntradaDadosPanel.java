package br.com.feltex.entrada.dados;

import javax.swing.JOptionPane;

public class EntradaDadosPanel {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		System.out.println("Nome digitado: " + nome);
		
		int idade = Integer.valueOf(JOptionPane.showInputDialog("Digite sua idade"));
		
		System.out.println("Idade digitada: " + idade);
		
		JOptionPane.showMessageDialog(null, "Nome informado " + nome + " idade " + idade);
		 

	}

}
