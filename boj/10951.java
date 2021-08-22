import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        while((str = br.readLine()) != null) {
            sb.append(str.charAt(0) + str.charAt(2) - 96).append('\n');
        }
        System.out.println(sb);
        br.close();
    }
}
