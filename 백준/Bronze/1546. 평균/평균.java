import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		// 몇과목
		int sub_cnt = Integer.parseInt(br.readLine());

		// 점수
		int[] score = new int[sub_cnt];

		// 최대값 M
		int max = score[0];

		// 합계
		int sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < sub_cnt; i++) {
			// 점수입력
			score[i] = Integer.parseInt(st.nextToken());

			if (max <= score[i]) {
				max = score[i];
			}

			sum += score[i]; // 점수 누적
		}
		
		br.close();

		double avg = (double) sum / (double) max * 100 / sub_cnt;

		System.out.println(avg);
	}

}