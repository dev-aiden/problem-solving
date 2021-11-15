import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        for(int i = 0; i < n; ++i) arr[i] = Long.parseLong(br.readLine());
        Arrays.sort(arr);
        long ans = arr[0], maxCount = 1, temp = 1;
        for(int i = 1; i < n; ++i) {
            if(arr[i] == arr[i - 1]) ++temp;
            else temp = 1;
            if(maxCount < temp) {
                maxCount = temp;
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}
