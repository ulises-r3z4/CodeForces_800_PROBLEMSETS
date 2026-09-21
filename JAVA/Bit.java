
import java.util.Scanner;

public class Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = 0;
		scan.nextLine();
		
		for (int i = 0; i < n; i++) {
			
			String p = scan.nextLine();
			
			if(p.indexOf("+") >= 0) {
				
				x++;
				
			}else{
				
				x--;
				
			}
		}
		
		System.out.println(x);
		scan.close();
		
	}
}
