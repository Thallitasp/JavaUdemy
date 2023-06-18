
public class exercicio02TratandoString {

	public static void main(String[] args) {
		String original = "abclkd FAJSO sodijasi AIDJIBCAJ ";
		
		String toLower = original.toLowerCase();
		String toUpper = original.toUpperCase();
		String trimm = original.trim();
		String subs = original.substring(2);
		String subs2 = original.substring(2, 9);
		String replac = original.replace('a', 'x');
		int ind = original.indexOf("bc");
		int ind2 = original.lastIndexOf("BC");
		
		System.out.println("Original: " + original);
		System.out.println("toLowerCase: " + toLower);
		System.out.println("toUpperCase: " + toUpper);
		System.out.println("trim: " + trimm);
		System.out.println("subString(2): " + subs);
		System.out.println("subString(2,9): " + subs2);
		System.out.println("replace: " + replac);
		System.out.println("IndexFirst: " + ind);
		System.out.println("IndexLast" + ind2);
		
		System.out.println("----------------------------");
		
		String frase = "potato apple orange";
		
		String[] vect = frase.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);

	}

}
