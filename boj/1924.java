import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int[] date = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private static String[] day = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int sum = 0;
        for (int i = 1; i < x; ++i) sum += date[i - 1];
        sum += y;
        System.out.println(day[sum % 7]);
    }
}
