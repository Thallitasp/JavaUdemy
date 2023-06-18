package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	public double priceDolar;
	public double amount;
	public double total;
	
	public double pagarValor() {
		total = amount * priceDolar;
		return total += (amount * priceDolar) * IOF;
	}
}
