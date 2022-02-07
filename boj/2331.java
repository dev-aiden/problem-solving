import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    static int check[] = new int[333333];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        System.out.println(solve(a, p, 1));
    }

    public static int next(int num, int p) {
        int ret = 0;
        while(num != 0) {
            int temp = 1;
            for(int i = 0; i < p; ++i) temp *= (num % 10);
            ret += temp;
            num /= 10;
        }
        return ret;
    }

    public static int solve(int num, int p, int cnt) {
        if(check[num] != 0) return check[num] - 1;
        check[num] = cnt;
        int temp = next(num, p);
        return solve(temp, p, cnt + 1);
    }
}