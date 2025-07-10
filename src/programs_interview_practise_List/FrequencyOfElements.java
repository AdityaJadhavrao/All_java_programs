package programs_interview_practise_List;
import java.util.*;

public class FrequencyOfElements {

    public static void main(String[] args) {

    	List<Integer> num = Arrays.asList(1,2,3,4,4,5,6,6);
    	Map<Integer, Integer> freq = new HashMap();
    	for(Integer nums : num)
    	{
    		freq.put(nums, freq.getOrDefault(nums, 0)+1);
    	}
    	for(Map.Entry<Integer,Integer> entry : freq.entrySet())
    	{
    		System.out.println("Elements : "+entry.getKey() + " Freqeuncy : "+entry.getValue());
    	}
        
    }
}
