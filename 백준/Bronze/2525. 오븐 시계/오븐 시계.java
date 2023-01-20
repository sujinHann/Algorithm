import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt(); // 시간
		int min = sc.nextInt(); // 분
		int timer = sc.nextInt(); // 요리시간
		
		sc.close();

		int Min = 60*hour+min; //시 ->분
		Min += timer;
		
        	int Hour = (Min / 60) % 24;
        	int minute = Min % 60;
 
        	System.out.println(Hour + " " + minute);
 
    }
}