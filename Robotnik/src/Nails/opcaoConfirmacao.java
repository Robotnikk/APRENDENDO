package Nails;

import javax.swing.JOptionPane;

public class opcaoConfirmacao {

	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("informe quantos carros");
		String pessoas = JOptionPane.showInputDialog("informe quantas pessoas");

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		int divisão = (int) (carroNumero / pessoaNumero);

		double resto = carroNumero % pessoaNumero;

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver resultado da divisao?");

		if (resposta == 0)
			
		{
			JOptionPane.showMessageDialog(null, "A divisão de carros deu: " + divisão);

		}

		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto?");

		if (resposta == 0)
			
		{

			JOptionPane.showMessageDialog(null, "O resto é: " + resto);
		}

	}
}
