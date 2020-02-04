import java.util.Locale;

public class Produtos {

	public static void main(String[] args) {
		String product = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, wich price is $ %.2f%n", product, price);
		System.out.printf("%s, wich price is $ %.2f%n%n", product2, price2);
		
		System.out.printf("Record: %d years old, code %d and gender: %c%n%n", age, code, gender);
		
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n%n", measure);
	}

}
