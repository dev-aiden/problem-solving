import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static int arr[] = new int[53];
    static int visit[] = new int[53];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; ++i) arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr, 0, n);
        int ans = 0;
        for(int i = n - 1; i >= 0; i -= 2) {
            if(i - 1 < 0) break;
            if(arr[i] > 1 && arr[i - 1] > 1) {
                visit[i] = visit[i - 1] = 1;
                ans += (arr[i] * arr[i - 1]);
            }
        }
        for(int i = 0; i < n; i += 2) {
            if(i + 1 >= n) break;
            if(visit[i] == 0 && visit[i + 1] == 0 && arr[i] <= 0 && arr[i + 1] <= 0) {
                visit[i] = visit[i + 1] = 1;
                ans += (arr[i] * arr[i + 1]);
            }
        }
        for(int i = 0; i < n; ++i) {
            if(visit[i] == 0) ans += arr[i];
        }
        System.out.println(ans);
    }
}