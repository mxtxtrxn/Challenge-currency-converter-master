package com.mxtxtrxn.currencies;
import java.util.Currency;
public class CurrencyTemplate {
	private String name;
	private String code;
	private String symbol;
	private double valueInUSD;
	
	public CurrencyTemplate(String code, double valueInUSD) {
		Currency curr = Currency.getInstance(code);
		this.name = curr.getDisplayName();
		this.code = curr.getCurrencyCode();
		this.symbol = curr.getSymbol();
		this.valueInUSD = valueInUSD;
	}
	
	public String getName() {
		return name;
	}
	public String getCode() {
		return code;
	}
	public double getValue() {
		return valueInUSD;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	
}
