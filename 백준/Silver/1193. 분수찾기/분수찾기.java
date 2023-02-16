import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());

		int n = 0;
		int k = 1;
		int top = 1;
		int cnt = 0;

		if (x == 1) {
			System.out.println("1/1");
		} else {
			while (cnt < x) {
				n++;
				cnt = n * (n + 1) / 2;
			}
			int num = x - (n - 1) * n / 2;
			if (n % 2 == 0) {
				top = num;
				k = n - num + 1;
			} else {
				top = n - num + 1;
				k = num;
			}
			System.out.println(top + "/" + k);
		}

	}
}