package secao17.exerc6.src.entities;

public class Product2 implements Comparable<Product> {

    private String name;
    private Double price;

    public Product2(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

    @Override
    public int compareTo(Product other) {
        return name.toUpperCase().compareTo(other.getName().toUpperCase());
    }
}
