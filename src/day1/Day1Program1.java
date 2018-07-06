package day1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day1Program1 {

	public static void main(String[] args) {
		
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the series");
		String val= x.nextLine();
		getArrayFromInteger(val);
		
	}
	
	public static void getArrayFromInteger(String number) {
		
		int[] num=new int[number.length()];
		for(int i=0;i<number.length();i++){
			num[i]=Character.getNumericValue(number.charAt(i));
			
		}

		int sum =0;
		
		for(int i=0;i<num.length-1;i++) {
			
			//System.out.println("array "+num[i]);
			
			if(num[i]==num[i+1]) {
				
				sum=sum+num[i];
			}
			if(i+2==num.length-1) {
				
				if(num[num.length-1]==num[0]) {
					
					
					sum=sum+num[0];
				}
				
			}
		
		}
		
		System.out.println("sum "+sum);
		
	}
		
		
}
	
	

