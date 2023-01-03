package com.mxtxtrxn.currencies;

import java.util.HashMap;

public class Currencies {
	
	private static HashMap<String, CurrencyTemplate> currencies = new HashMap<String, CurrencyTemplate>();
		
	
	public void showCurrencies() {
		System.out.println(currencies);
	}
	
	public void addCurrencies(String code, CurrencyTemplate currency) {
		currencies.put(code, currency);
	}
	
	public HashMap<String, CurrencyTemplate> getCurrencies() {
		return currencies;
	}
	
}
