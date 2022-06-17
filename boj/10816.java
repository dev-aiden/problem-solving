import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int n, m, idx;
    static int[] arr = new int[500003];
    static int[] arr2 = new int[500003];
    static int[] cnt = new int[20000003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; ++i) {
            int num = Integer.parseInt(st.nextToken());
            num += 10000000;
            if(cnt[num] == 0) {
                arr[idx++] = num;
                ++cnt[num];
            } else {
                ++cnt[num];
            }
        }
        Arrays.sort(arr, 0, idx);
        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; ++i) arr2[i] = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; ++i) sb.append(bSearch(arr2[i] + 10000000)).append(" ");
        sb.append("\n");
        System.out.println(sb);
    }

    public static int bSearch(int num) {
        int start = 0, end = idx - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == num) {
                return cnt[num];
            } else if(arr[mid] > num) {
                end = mid - 1;
            } else if(arr[mid] < num) {
                start = mid + 1;
            }
        }
        return 0;
    }
}