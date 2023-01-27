import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int num = Integer.parseInt(st.nextToken()); // 숫자개수
		int arr[] = new int[num]; // 배열 선언

		int max, min;

		st = new StringTokenizer(br.readLine()); // 공백

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		max = arr[0]; //최대값 초기화
		min = arr[0]; //최소값 초기화

		for (int i = 1; i < arr.length; i++) {
			if (max <= arr[i])
				max = arr[i];
			if (min >= arr[i])
				min = arr[i];
		}

		System.out.println(min+" "+max);
		br.close();
	}

}
