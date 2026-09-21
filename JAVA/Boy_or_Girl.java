

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Boy_or_Girl {

	    public static void main(String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String username = br.readLine();
	       
	        HashSet<Character> distinctChars = new HashSet<>();

	        for (char c : username.toCharArray()) {
	            distinctChars.add(c); 
	        }

	        if (distinctChars.size() % 2 == 0) {
	            System.out.println("CHAT WITH HER!");
	        } else {
	            System.out.println("IGNORE HIM!");
	        }

	    }
	}