
import java.util.Scanner;

public class Next_Round {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scan.nextInt();
        }

	    int cutoff = scores[k - 1]; // Puntaje del k-esimo jugador
	    int result = 0;
	
	     for (int score : scores) {
	    	 
	          if (score >= cutoff && score > 0) {
	        	  
	              result++;
	              
	          }
        }
	
	    System.out.println(result);
	     
	    scan.close();
    }
}