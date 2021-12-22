package modulo9;

import javax.swing.JOptionPane;

public class TreinoDados {
	public static void main(String[] args) {
	
		String bovino = JOptionPane.showInputDialog("Informe Nº Bois");  /*Input para entrada de dados*/
		String dinheiro = JOptionPane.showInputDialog("Informe o valor individual de cada Cabeça");
		String sugestao = JOptionPane.showInputDialog("deixe uma sugestao");
		
		double bovinoNumero = Double.parseDouble(bovino);
		double dinheiroNumero = Double.parseDouble(dinheiro);
		
		double valorTotal = (bovinoNumero * dinheiroNumero);
		
		System.out.println(sugestao);
		System.out.println(valorTotal);
		
		JOptionPane.showMessageDialog(null, valorTotal);
		
		
		
		
	}
	}

