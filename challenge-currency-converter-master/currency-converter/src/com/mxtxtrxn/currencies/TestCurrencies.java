package com.mxtxtrxn.currencies;
import java.util.Currency;
public class TestCurrencies {
	public static void main(String[] args) {
		
		Currency currency = Currency.getInstance("ARS");
		System.out.println(currency.getDisplayName());
		//currency.showCurrencies();
		
		//System.out.println(currency.convertCurrencies(200, "ARS", "GBP"));
	}
}
