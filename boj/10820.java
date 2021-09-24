import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int arr[] = new int[4];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;
        while((s = br.readLine()) != null) {
            int len = s.length();
            for(int i = 0; i < len; ++i) {
                if (s.charAt(i) >= 97 && s.charAt(i) <= 122) ++arr[0];
                else if (s.charAt(i) >= 65 && s.charAt(i) <= 90) ++arr[1];
                else if (s.charAt(i) >= 48 && s.charAt(i) <= 57) ++arr[2];
                else if (s.charAt(i) == ' ') ++arr[3];
            }
            for(int i = 0; i < 4; ++i) {
                sb.append(arr[i]).append(" ");
                arr[i] = 0;
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
