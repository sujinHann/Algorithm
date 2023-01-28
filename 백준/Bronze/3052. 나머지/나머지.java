import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[10];
		int[] total = new int[1000]; // 전체배열
		int cnt = 0;

		
		// 10개입력
		for (int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			arr[i] = arr[i] % 42; // 42로 나눈 나머지를 배열에 저장
		}
		
		br.close();

		for (int i = 0; i < 10; i++) {
			total[arr[i]]++; // arr값을 total의 arr값 배열에 넣어줘서 1씩 증가시킴, 값이 있으면 1씩 증가
		}

		for (int i = 0; i < total.length; i++) {
			if (total[i] != 0) { // 전체 배열에서 값이 있으면 카운팅
				cnt++;
			}
		}

		System.out.println(cnt);

	}

}