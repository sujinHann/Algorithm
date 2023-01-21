import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);

		int rcpt = sc.nextInt(); // 영수증 금액
		int total = sc.nextInt(); // 토탈 개수

		int sum = 0;

		for (int i = 1; i <= total; i++) {
			int price = sc.nextInt(); // 물건 가격
			int cnt = sc.nextInt(); // 물건 개수

			sum += price * cnt;
		}
		
		sc.close();
		
		if (rcpt == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}