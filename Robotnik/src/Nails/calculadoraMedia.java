package Nails;

import javax.swing.JOptionPane;

public class calculadoraMedia {

	public static void main(String[] args) {
/*
		String numero1 = JOptionPane.showInputDialog("informe o numero 1");
		String numero2 = JOptionPane.showInputDialog("informe o numero 2");
		String numero3 = JOptionPane.showInputDialog("informe o numero 3");
		String numero4 = JOptionPane.showInputDialog("informe o numero 4");

		double numero01 = Double.parseDouble(numero1);
		double numero02 = Double.parseDouble(numero2);
		double numero03 = Double.parseDouble(numero3);
		double numero04 = Double.parseDouble(numero4);

		int media = (int) (numero01 + numero02 + numero03 + numero04) / 4;

		

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver a media?");

		if (resposta == 0)
			
		{
			JOptionPane.showMessageDialog(null, "A media deu: " + media);

		}

		

	} */
	
	
		 
		 String nota1 = JOptionPane.showInputDialog("Informe a nota 1");
		 String nota2 = JOptionPane.showInputDialog("Informe a nota 2");
		 String nota3 = JOptionPane.showInputDialog("Informe a nota 3");
		 String nota4 = JOptionPane.showInputDialog("Informe a nota 4");
		 
		 double dnota1 = Double.parseDouble(nota1);
		 double dnota2 = Double.parseDouble(nota2);
		 double dnota3 = Double.parseDouble(nota3);
		 double dnota4 = Double.parseDouble(nota4);
		 
		 double media = (dnota1 + dnota2 + dnota3 + dnota4) /4;
		 
		 
		 
		 /* Media para aprovação é 70*/
		 
		 if (media >= 50) {
		 
			 if (media >= 70) {
				 JOptionPane.showMessageDialog(null, "Parabens mulek, nunca acreditei media de: " + media);
		 } else {
			 JOptionPane.showMessageDialog(null, "Sabia que era meio inutil media de: " + media);
		 }
		 } else {
			 JOptionPane.showMessageDialog(null, "Vamos conversar quando chegar em casa =;= media de: " + media);
		 }
		 
		 
		 
		 
		 }
		 
}

