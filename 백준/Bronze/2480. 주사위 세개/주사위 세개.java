import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		sc.close();

		// 1. 만약 모든 변수가 다르면
		int max = 0;

		if (a != b && b != c && a != c) {
			// 만약 a > b 라면
			if (a > b) {
				// c > a > b 일때
				if (c > a) {
					max = c;
				} else {
					max = a;
				}
			} else {
				// c > b > a 일때
				if (c > b) {
					max = c;
				} // b > (a, c)
				else {
					max = b;
				}

			}
			System.out.println(max * 100);
		}

		// 2. 적어도 한 쌍 이상의 서로 같은 변수가 존재할 경우
		else {
			// 모든 변수가 같은 경우
			if (a == b && a == c) {
				System.out.println(10000 + a * 1000);
			} else {
				// a가 b 혹은 c랑만 같은 경우
				if (a == b || a == c) {
					System.out.println(1000 + a * 100);
				}
				// b가 c랑 같은 경우
				else {
					System.out.println(1000 + b * 100);
				}

			}
		}
 
    }
}