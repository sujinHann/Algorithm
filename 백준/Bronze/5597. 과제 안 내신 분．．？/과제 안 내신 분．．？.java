import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean arr[] = new boolean[31];

		for (int i = 1; i < 29; i++) {
			int a = Integer.parseInt(br.readLine());
			arr[a] = true;
		}

		br.close();

		for (int i = 1; i < arr.length; i++) {
			if (!arr[i]) {
				System.out.println(i);
			}
		}

	}

}
