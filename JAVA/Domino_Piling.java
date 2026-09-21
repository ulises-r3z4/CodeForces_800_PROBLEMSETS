
import java.util.Scanner;

public class Domino_Piling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		System.out.println((int) Math.floor((N*M)/2));
		scan.close();
		
	}
}