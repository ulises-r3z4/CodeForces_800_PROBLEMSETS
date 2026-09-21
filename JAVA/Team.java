
import java.util.Scanner;

public class Team {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] [] a = new int[n] [3];
		int aux = 0;
		int r = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				a [i] [j] = scan.nextInt();
			}
		}
		
		scan.close();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				if(a [i] [j] == 1) {
					aux++;
				}
				if(aux == 2) {
					r++;
					break;
				}
			}
			aux = 0;
		}
		
		System.out.println(r);
	    
	  }
}

