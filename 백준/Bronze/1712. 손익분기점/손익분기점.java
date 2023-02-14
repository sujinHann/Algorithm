import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        if (c - b == 0) {  
            System.out.print(-1);
            return;
        }
        
        int x = a / (c - b);
        if (x < 0) {
            System.out.print(-1);
        } else {
            System.out.print(x + 1);
        }
    }
}