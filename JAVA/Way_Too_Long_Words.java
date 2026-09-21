
import java.util.Scanner;

public class Way_Too_Long_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			String p = scan.nextLine();
			if(p.length() > 10) {
				String a = p.charAt(0)+String.valueOf(p.length()-2)+p.charAt(p.length()-1);
				System.out.println(a);
			}else {
				System.out.println(p);
			}
		}
		scan.close();
	}

}
