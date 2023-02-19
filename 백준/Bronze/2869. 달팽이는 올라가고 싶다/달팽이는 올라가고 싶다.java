import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
		int a = Integer.parseInt(st.nextToken()); // up
		int b = Integer.parseInt(st.nextToken()); // down
		int c = Integer.parseInt(st.nextToken()); 
 
		int days = (c - b) / (a - b);
		if ((c - b) % (a - b) != 0)
			days++;
 
		System.out.println(days);
	}
}