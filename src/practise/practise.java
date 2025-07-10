package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class practise {
	
	public static void main(String[] args) 
	{
		int[] a = {12,3,4,56,7,8};
		int largest = Integer.MIN_VALUE;
		int digit;
		for(int i=0;i<a.length;i++)
		{
			digit = a[i];
			if(digit>largest)
			{
				largest=digit;
			}
		}
		System.out.println("largest element in the array is : "+largest);
	}
}



