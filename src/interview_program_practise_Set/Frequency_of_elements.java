package interview_program_practise_Set;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Frequency_of_elements {
	public static <Hashmap> void main(String [] args){
        String str = "aditya";
        
        LinkedHashMap <Character, Integer> map = new LinkedHashMap<>();

        for(int i=0; i<str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }

        for(Character num: map.keySet()){
            
                System.out.println(num+" is : "+map.get(num));
            
        }
    }
}
