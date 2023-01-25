import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		sc.close();
		
		int cnt = 0;
		int copy = num;

		while (true) {
			num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
			cnt++;

			if (copy == num) {
				break;
			}

		}
		System.out.println(cnt);

	}

}
