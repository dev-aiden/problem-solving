import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int len = str.length();
        int ans = 0, num= 0, flag = 0;
        for(int i = 0; i < len; ++i) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num *= 10;
                num += (str.charAt(i) - '0');
            } else {
                if(flag == 1) num *= (-1);
                ans += num;
                num = 0;
                if(str.charAt(i) == '-') {
                    flag = 1;
                }
            }
        }
        if(flag == 1) num *= (-1);
        ans += num;
        System.out.println(ans);
    }
}