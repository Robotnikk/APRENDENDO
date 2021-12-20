package Nails;

import javax.swing.JOptionPane;

public class entradaDeDados {

	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("informe quantos carros");
		String pessoas = JOptionPane.showInputDialog("informe quantas pessoas");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisão = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		
		
		System.out.println("divisão deu: " + divisão + "carros e sobrou" + resto + "carros");
		
		
		JOptionPane.showMessageDialog(null, "divisão deu: " + divisão + "carros e sobrou " + resto + "carros");
	
	
	}
}
