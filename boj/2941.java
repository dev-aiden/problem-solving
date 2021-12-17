import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {

    static String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length(), ans = 0;
        for(int i = 0; i < len; ++i) {
            int flag = 0;
            for(int j = 0; j < 8; ++j) {
                int tempLen = arr[j].length();
                if(i + tempLen <= len && Objects.equals(arr[j], s.substring(i, i + tempLen))) {
                    ++ans;
                    i += tempLen - 1;
                    flag = 1;
                }
            }
            if(flag == 0) ++ans;
        }
        System.out.println(ans);
    }
}
