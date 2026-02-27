package secao17.exerc6.src.application;

import secao17.exerc6.src.entities.Product2;

import java.util.Set;
import java.util.TreeSet;

public class Program4 {

    public static void main(String[] args) {

        Set<Product2> set = new TreeSet<>();

        set.add(new Product2("TV", 900.0));
        set.add(new Product2("Notebook", 1200.0));
        set.add(new Product2("Tablet", 400.0));

        for (Product2 p : set) {
            System.out.println(p);
        }

    }
}
