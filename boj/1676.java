import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int twoCount = 0, fiveCount = 0;
        for(int i = n; i >= 1; --i) {
            int temp = i;
            while(temp % 2 == 0) {
                temp /= 2;
                ++twoCount;
            }
            while(temp % 5 == 0) {
                temp /= 5;
                ++fiveCount;
            }
        }
        System.out.println((twoCount < fiveCount) ? twoCount : fiveCount);
    }
}
