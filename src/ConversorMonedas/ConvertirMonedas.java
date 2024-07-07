package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void ConvertirPesosArgentinoDolares(double valor) {
	        double monedaDolar = valor / 915.46;
	        monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
	        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares (valor a 7 de julio de 2024)");
	}
	public void ConvertirPesosArgentinoEuros(double valor) {
		double monedaEuro = valor / 989.16;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros (valor a 7 de julio de 2024)");
	}
	public void ConvertirPesosArgentinoLibra(double valor) {
		double monedaLibra = valor / 1170.24;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras Esterlinas (valor a 7 de julio de 2024)");
	}
	public void ConvertirPesosArgentinoYen(double valor) {
		double monedaYen = valor / 5.69;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yen Japonés (valor a 7 de julio de 2024)");
	}
	public void ConvertirPesosArgentinoWon(double valor) {
		double monedaWon = valor / 0.66;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Won sub-coreano (valor a 7 de julio de 2024)");
	}
	
	
	public void ConvertirDolaresPesosArgentino(double valor) {
		double monedaDolar = 915.46 * valor;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Dolares " + monedaDolar + " en pesos (valor a 7 de julio de 2024)");
	}
	public void ConvertirEurosPesosArgentino(double valor) {
		double monedaEuro = valor * 989.16;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Euros " + monedaEuro + " en pesos (valor a 7 de julio de 2024)");
	}
	public void ConvertirLibraPesosArgentino(double valor) {
		double monedaLibra = valor * 1170.24;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Libras Esterlinas " + monedaLibra + " en pesos (valor a 7 de julio de 2024)");
	}
	public void ConvertirYenPesosArgentino(double valor) {
		double monedaYen = valor * 5.69;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Yen Japonés " + monedaYen + " en pesos (valor a 7 de julio de 2024)");
	}
	public void ConvertirWonPesosArgentino(double valor) {
		double monedaWon = valor * 0.66;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Won sub-coreano " + monedaWon + " en pesos (valor a 7 de julio de 2024)");
	}

}
