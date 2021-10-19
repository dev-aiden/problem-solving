import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String s;
    static int[] d = new int[5003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        int len = s.length();
        s = " " + s;
        System.out.println(solve(len));
    }

    public static int solve(int n) {
        if (n == 0) return 1;
        if (d[n] > 0) return d[n];
        int num = s.charAt(n) - 48;
        if (num >= 1 && num <= 9) {
            d[n] = solve(n - 1);
            d[n] %= 1000000;
        }
        if (n != 1 && s.charAt(n - 1) - 48 != 0) {
            num = (s.charAt(n - 1) - 48) * 10 + (s.charAt(n) - 48);
            if (num >= 10 && num <= 26) {
                d[n] += solve(n - 2);
                d[n] %= 1000000;
            }
        }
        return d[n];
    }
}
