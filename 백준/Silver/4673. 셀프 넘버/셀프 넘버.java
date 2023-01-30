public class Main {

public static void main(String[] args) {

		//셀프 넘버를 체크할 배열 생성
		int[] check = new int[10001]; // 1부터 10000이므로
	
		//10000보다 작거나 같은 셀프 넘버를 한줄에 하나식 출력		
		for(int i = 1; i<10001; i++){
			int n = d(i);
			
			if(n < 10001) { // 1~10000까지 돌면서 셀프넘버가 아니면 1을 넣음
				check[n] = 1;
			}
		}
		
		for(int j=1; j<10001; j++) {
			if(check[j]==0) {
				System.out.println(j);
			}
		}

	}
	
	//함수 선언 
	public static int d(int number) {
		
		int sum = number;
		
		while(number !=0) {
			sum = sum + (number % 10); // 첫째 자리수
			number = number/10; // 10을 나누어 첫째자리를 없앰
		}
		
		return sum;
		
	}

}