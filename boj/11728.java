import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int arr[] = new int[2000003];
    static int arr1[] = new int[1000003];
    static int arr2[] = new int[1000003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i) arr1[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; ++i) arr2[i] = Integer.parseInt(st.nextToken());
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) arr[k++] = arr1[i++];
            else arr[k++] = arr2[j++];
        }
        while (i < n) arr[k++] = arr1[i++];
        while (j < m) arr[k++] = arr2[j++];
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < n + m; ++i) sb.append(arr[i]).append(" ");
        sb.append("\n");
        System.out.println(sb);
    }
}
