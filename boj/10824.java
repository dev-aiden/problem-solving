import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long s1 = Long.parseLong(st.nextToken() + st.nextToken());
        long s2 = Long.parseLong(st.nextToken() + st.nextToken());
        System.out.println(s1 + s2);
    }
}
