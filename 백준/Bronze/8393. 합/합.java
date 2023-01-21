import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int j = 0;

		sc.close();

		for (int i = 1; i <= num; i++) {
			j += i;
		}
		System.out.println(j);

	}
}