package stringBuilder_and_stringbuffer;

public class StringBufferPractise {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("java");
		sb.append("Programming");
		sb.reverse();
		
		System.out.println("Output of String buffer : "+sb);
	}

}
