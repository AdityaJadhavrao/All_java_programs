package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class practise {
	
	public static void main(String [] args){
        int rows =4;
        char ch = 'a';
        for( int i=1; i<=rows; i++){

            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i-1); j++){
                System.out.print(ch);
                ch++;
            }

            System.out.println();
            ch='a';
        }
    }
}



