import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int arr[] = new int[13];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length(), sum = 0;
        for(int i = 0; i < len; ++i) {
            sum += s.charAt(i) - '0';
            ++arr[s.charAt(i) - '0'];
        }
        StringBuilder sb = new StringBuilder();
        if(arr[0] == 0 || (sum % 3 != 0)) {
            sb.append(-1);
        } else {
            for(int i = 9; i >= 0; --i) {
                for(int j = 0; j < arr[i]; ++j) {
                    sb.append(i);
                }
            }
        }
        sb.append("\n");
        System.out.println(sb);
    }
}