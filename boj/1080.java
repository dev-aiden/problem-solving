import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int arr[][] = new int[53][53];
    static int arr2[][] = new int[53][53];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; ++i) {
            String s = br.readLine();
            for(int j = 0; j < m; ++j) arr[i][j] = s.charAt(j) - '0';
        }
        for(int i = 0; i < n; ++i) {
            String s = br.readLine();
            for(int j = 0; j < m; ++j) arr2[i][j] = s.charAt(j) - '0';
        }
        int ans = 0;
        for(int i = 0; i < n - 2; ++i) {
            for(int j = 0; j < m - 2; ++j) {
                if(arr[i][j] != arr2[i][j]) {
                    ++ans;
                    for(int k = 0; k < 3; ++k) {
                        for(int l = 0; l < 3; ++l) {
                            if(arr[i + k][j + l] == 1) arr[i + k][j + l] = 0;
                            else arr[i + k][j + l] = 1;
                        }
                    }
                }
            }
        }
        int flag = 1;
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                if(arr[i][j] != arr2[i][j]) flag = 0;
            }
        }
        if(flag == 0) System.out.println(-1);
        else System.out.println(ans);
    }
}