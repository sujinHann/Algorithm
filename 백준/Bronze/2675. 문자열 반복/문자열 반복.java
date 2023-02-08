import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < a; i++) {
	
			String[] str = br.readLine().split(" ");	
			
			int b = Integer.parseInt(str[0]);	
			String c = str[1];
			
			for(int j = 0; j < c.length(); j++) {
				for(int k = 0; k < b; k++) {
					System.out.print(c.charAt(j));
				}
			}
			System.out.println();
		}
	}
 
 
}