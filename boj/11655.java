import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int len = s.length();
        for(int i = 0; i < len; ++i) {
            char ch = s.charAt(i);
            if (ch >= 65 && ch <= 90) {
                if(ch + 13 <= 90) ch += 13;
                else ch -= 13;
            } else if (ch >= 97 && ch <= 122) {
                if(ch + 13 <= 122) ch += 13;
                else ch -= 13;
            }
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
