import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int arr[] = new int[26];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int len = s.length();
        for(int i = 0; i < len; ++i) ++arr[s.charAt(i) - 97];
        for(int i = 0; i < 26; ++i) sb.append(arr[i]).append(" ");
        sb.append("\n");
        System.out.println(sb);
    }
}
