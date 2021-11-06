import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static int arr[] = new int[1000003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; ++i) arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr, 0, n);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; ++i) sb.append(arr[i]).append("\n");
        System.out.println(sb);
    }
}
