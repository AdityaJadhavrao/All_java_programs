package stringBuilder_and_stringbuffer;

public class StringBuilderPractise {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("Java");
		sb.insert(5, ",");
		sb.replace(0, 5, "Fun");
		sb.delete(3,4);
		
		System.out.println("String builder text : "+sb);
	}
}
