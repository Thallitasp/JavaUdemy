package secao17.exerc6.src.application;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));
        System.out.println();

        System.out.println("Elements: ");

        for (String p : set) {
            System.out.println(p);
        }
    }
}
