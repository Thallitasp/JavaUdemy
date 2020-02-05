package entities;

public class Product {

	public String Name;
	public double Price;
	public int Quantity;
	
	public double totalValueInStock(){
		return Price * Quantity;
	}
	
	public void AddProducts(int quant) {
		Quantity += quant;
	}
	
	public void RemoveProducts(int diminuir) {
		Quantity -= diminuir;
	}
	
	public String toString() {
		return Name
			+ ", $ "
			+ String.format("%.2f", Price)
			+ ", "
			+ Quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}
