
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
	public static void main(String[] args) throws IOException {
 
		int cnt = 0;
		int num = Integer.parseInt(br.readLine());
 
		for (int i = 0; i < num; i++) {
			if (chk()) {
				cnt++;
			}
		}
		System.out.print(cnt);
	}
 
	public static boolean chk() throws IOException {
		boolean[] chk = new boolean[26];
		int p = 0;
		String st = br.readLine();
		
		for(int i = 0; i < st.length(); i++) {
			int now = st.charAt(i);
			
			
			if (p != now) {		
				if (!chk[now - 'a']) {
					chk[now - 'a'] = true;
					p = now;	
				}
				else {
					return false;	
				}
			}
		}    
		return true;
	}
}