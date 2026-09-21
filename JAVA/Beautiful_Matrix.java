
import java.util.Scanner;

public class Beautiful_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int [] [] m = new int [5] [5];
		int aux_i = 0;
		int aux_j = 0;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				
				m [i] [j] =scan.nextInt();
				
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(m [i] [j] == 1) {
					
					aux_i = i;
					aux_j = j;
					break;
		
				}
			}
			if(aux_i != 0 || aux_j != 0) {
				
				break;
				
			}
		}
		
		System.out.println(Math.abs(aux_i-2)+Math.abs(aux_j-2));
		scan.close();
		
	}
}
