
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Petya_and_Strings {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String p1 = br.readLine().toLowerCase();
		String p2 = br.readLine().toLowerCase();
		int r = p1.compareTo(p2);
		
		if(r > 0) {
			
			System.out.println(1);
			
		}else if (r < 0) {
			
			System.out.println(-1);
		
		}else{
				
			System.out.println(0);
				
		}
	}
}