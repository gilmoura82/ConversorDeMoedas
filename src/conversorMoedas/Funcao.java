package conversorMoedas;

import javax.swing.JOptionPane;

public class Funcao {
	
	ConverterMoedas moedas = new ConverterMoedas();
	
	public void ConverterMoedas (double valorRecebido) {
		
		String opcao = JOptionPane.showInputDialog(null, "Escolha uma moeda que deseja "
				+ "converter", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] 
					{"Real Para D�lar", "Real Para Euro"}, 
					"Escolha Uma Op��o").toString();
		
		switch(opcao) {
		case "Real Para D�lar":
			moedas.ConverterReaisParaDolar(valorRecebido);
			break;
		case "Real Para Euro":
			moedas.ConverterReaisParaEuro(valorRecebido);
			break;
		}
		
	}

}
