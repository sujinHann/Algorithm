import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()); // 총 숫자개수
		int b = Integer.parseInt(st.nextToken()); // 기준 수 

		st = new StringTokenizer(br.readLine()); // 공백
		
		for (int i = 0; i < a; i++) {
			int N = Integer.parseInt(st.nextToken()); // a개의 숫자 입력 
			// b보다 작은 수가 입력 되었을 경우 출력버퍼에 저장
			if (N < b) { 
				bw.write(N + " ");
			}
		}
		// 버퍼에 저장된 문자열 한번에 출력
		bw.flush();
	}
}