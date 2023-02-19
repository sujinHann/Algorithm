import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());	
 
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
			int a = Integer.parseInt(st.nextToken());
			st.nextToken();			
			int b = Integer.parseInt(st.nextToken());
 
			if (b % a == 0) {
				sb.append((a * 100) + (b / a)).append('\n');
 
			} else {
				sb.append(((b % a) * 100) + ((b / a) + 1)).append('\n');
			}
		}
		System.out.print(sb);
 
	}
}