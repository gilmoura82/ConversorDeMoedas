package conversorMoedas;

import javax.swing.JOptionPane;

public class ConverterMoedas {

	public void ConverterReaisParaDolar(double valor) {
		double moedaDolar = valor / 5.23;
		moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Voc� tem $ " + moedaDolar + " d�lares");
	}

	public void ConverterReaisParaEuro(double valor) {
		double moedaEuro = valor / 5.52;
		moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Voc� tem $ " 
		+ moedaEuro + " euros");
	}
}
