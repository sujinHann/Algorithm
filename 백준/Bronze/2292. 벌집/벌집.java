import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int num = Integer.parseInt(br.readLine());
		int cnt = 1; 
		int rng = 2;	
 
		if (num == 1) {
			System.out.print(1);
		}
 
		else {
			while (rng <= num) {	// 범위가 N보다 커지기 직전까지 반복 
				rng = rng + (6 * cnt);
				cnt++;
			}
			System.out.print(cnt);
		}
	}
}