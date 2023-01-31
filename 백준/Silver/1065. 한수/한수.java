import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print(math(sc.nextInt()));
		sc.close();
	}
 
	public static int math(int num) {
		int count = 0; // 한수 카운팅
 
		if (num < 100) {
			return num;
		}
 
		else {
			count = 99;
			if (num == 1000) {
				num = 999;
			}
 
			for (int i = 100; i <= num; i++) {
				int h = i / 100; // 백의 자릿수
				int t = (i / 10) % 10; // 십의 자릿수
				int o = i % 10;

				if ((h - t) == (t - o)) { // 각 자릿수가 수열을 이루면
					count++;
				}
			}
		}

		return count;
	}
}