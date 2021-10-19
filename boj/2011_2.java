import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] d = new int[5003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length();
        s = " " + s;
        d[0] = 1;
        for (int i = 1; i <= len; ++i) {
            int num = s.charAt(i) - 48;
            if (num >= 1 && num <= 9) {
                d[i] = d[i - 1];
                d[i] %= 1000000;
            }
            if (i == 1 || s.charAt(i - 1) - 48 == 0) continue;
            num = (s.charAt(i - 1) - 48) * 10 + (s.charAt(i) - 48);
            if (num >= 10 && num <= 26) {
                d[i] += d[i - 2];
                d[i] %= 1000000;
            }
        }
        System.out.println(d[len]);
    }
}
