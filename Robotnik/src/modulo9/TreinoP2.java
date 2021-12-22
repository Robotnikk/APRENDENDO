package modulo9;

import javax.swing.JOptionPane;

public class TreinoP2 {
	public static void main(String[] args) {

		TreinoP1 APP = new TreinoP1();

		String bovino = JOptionPane.showInputDialog("Informe quantidade de bovinos");
		String valor = JOptionPane.showInputDialog("Informe valor de cada bovino separado");

		double bovinoNumero = Double.parseDouble(bovino);
		double valorNumero = Double.parseDouble(valor);

		double valorTotal = (bovinoNumero * valorNumero);

		APP.setAnimal(bovino);
		APP.setIdade(36);
		APP.setSexo("M");

		JOptionPane.showMessageDialog(null, valorTotal);

	}
}
