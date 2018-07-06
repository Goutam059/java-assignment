package day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Day4Problem1 {
	
	public static int calculate(String spreadsheetPath) throws Exception {
		String line = "";
        int count=0;
		int sum = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(new File(spreadsheetPath)))) {
			while ((line = br.readLine()) != null) {
				sum =  calculateSum(line);
				System.out.println(sum);
				if( sum==0) {
					count++;
				}
			}
		}

		return count;
	}
	
private static int calculateSum(String row) {
	int count1 = 0;
	//List<String> list = new ArrayList<String>();
	
	
	String[] array=row.split(",");
	
	for(int i =0;i<array.length-1;i++) {
		for(int j =i+1;j<array.length;j++) {

			
			if(array[i].equals(array[j]) ) {
				
				count1++;
		
				
			}
			
			
		}
	}
	return count1;
}
	
	
public static void main(String[] args) throws Exception{
	System.out.println(calculate("/Users/goutam.g/Desktop/file.csv"));
}

	
}
	