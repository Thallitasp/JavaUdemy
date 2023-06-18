package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock(){
		return price * quantity;
	}
	
	public void AddProducts(int quant) {
		quantity += quant;
	}
	
	public void RemoveProducts(int diminuir) {
		quantity -= diminuir;
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}
