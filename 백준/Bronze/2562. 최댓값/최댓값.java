import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[9]; // 배열 선언
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		int max = arr[0]; //최대값 초기화
		int cnt = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (max <= arr[i]) {
				max = arr[i];
				cnt = i;
			}
				
		}

		System.out.println(max);
		System.out.println(cnt+1);
		
	}

}
