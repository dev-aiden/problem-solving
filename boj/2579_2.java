import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int d[] = new int[303];
    static int a[] = new int[303];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; ++i) {
            a[i] = Integer.parseInt(br.readLine());
            if(i <= 2) {
                d[i] = a[i - 1] + a[i];
                continue;
            }
            d[i] = d[i - 2] + a[i];
            int temp = d[i - 3] + a[i - 1] + a[i];
            if(d[i] < temp) d[i] = temp;
        }
        System.out.println(d[n]);
    }
}
