import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int arr[] = new int[1003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; ++i) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr, 0, n);
        int ans = arr[0], temp = arr[0];
        for(int i = 1; i < n; ++i) {
            temp += arr[i];
            ans += temp;
        }
        System.out.println(ans);
    }
}