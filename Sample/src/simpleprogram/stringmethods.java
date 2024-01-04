package simpleprogram;

public class stringmethods {
public static void main(String[]args) {
	//charAt()
	String color="Pink";
	char result =color.charAt(2);
	System.out.println(result);

	//concatenate()
	String first="C.";
	String last=" Bhuvani";
	String result2=first.concat(last);
	System.out.println(result2);
	
	//contains()
	String name="Bhuvani";
			System.out.println(name.contains("i"));
			System.out.println(name.contains("t"));
			
	//indexOf()
			String value="Blue is my fav color";
			System.out.println(value.indexOf("fav"));
			
	//toUppercase()
			System.out.println(value.toUpperCase());
			System.out.println(value.toLowerCase());
			
	//length()
			System.out.println(value.length());
			
	//empty()
			System.out.println(value.isEmpty());
			
	//replace()
			String str1="sky is blue and blue is my fav color";
			System.out.println(str1.replaceFirst("blue","White"));
			System.out.println(str1.replaceAll("blue","White"));
}

}
