package com.mxtxtrxn.currencies;

import javax.swing.JOptionPane;

public class SelectCurrencies {
	
//	private static String[] currencies = { "USD", "GBP", "EUR", "ARS", "BRL" };
	private String fromCurrency;
	private String toCurrency;
	public SelectCurrencies(String[] currencies) {

		fromCurrency = (String) JOptionPane.showInputDialog(null,

				"Elija la divisa que quiere convertir", "Elija una divisa",

				JOptionPane.INFORMATION_MESSAGE, null,

				currencies, currencies[0]);
		
		toCurrency = (String) JOptionPane.showInputDialog(null,

				"Elija la divisa a la que desea convertir", "Elija una divisa",

				JOptionPane.INFORMATION_MESSAGE, null,

				currencies, currencies[0]);

	}
	
	public String getFromCurrency() {
		return fromCurrency;
	}
	
	public String getToCurrency() {
		return toCurrency;
	}
}
