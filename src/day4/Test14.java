package day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test14 {
	public static int calculate(String spreadsheetPath) throws Exception {
		String line = "";
        int count1=0;
		int sum = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(new File(spreadsheetPath)))) {
			while ((line = br.readLine()) != null) {
				sum =  calculateSum(line);
				System.out.println(sum);
				if( sum==0) {
					count1++;
				}
			}
		}

		return count1;
	}
	
	
	private static int calculateSum(String row) {
    String item[] = row.split(",");
   
    int count=0;
    
    

    HashMap<String, Integer> map = new HashMap<>();

    for (String t : item) {
        if (map.containsKey(t)) {
            map.put(t, map.get(t) + 1);

        } else {
            map.put(t, 1);
        }
        if(map.get(t)>1) {
        	//System.out.println("wrong");
        	count++;
        }
        
    }
   
  return count;
	}


	
    public static void main(String[] args) throws Exception{
    	System.out.println(calculate("/Users/goutam.g/Desktop/file.csv"));
    }

    	
    }