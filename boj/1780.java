import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int arr[][] = new int[2222][2222];
    static int ans[] = new int[3]; // [0] : -1, [1] : 0, [2] : 1

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; ++j) arr[i][j] = Integer.parseInt(st.nextToken());
        }
        solve(0, 0, n);
        StringBuilder sb = new StringBuilder();
        sb.append(ans[0]).append("\n").append(ans[1]).append("\n").append(ans[2]).append("\n");
        System.out.println(sb);
    }

    public static void solve(int startRow, int startCol, int size) {
        int num = arr[startRow][startCol];
        int flag = 1;
        for (int i = startRow; i < startRow + size; ++i) {
            for (int j = startCol; j < startCol + size; ++j) {
                if (num != arr[i][j]) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 0) break;
        }
        if (flag == 0) {
            solve(startRow, startCol, size / 3);
            solve(startRow, startCol + size / 3, size / 3);
            solve(startRow, startCol + (2 * (size / 3)), size / 3);
            solve(startRow + size / 3, startCol, size / 3);
            solve(startRow + size / 3, startCol + size / 3, size / 3);
            solve(startRow + size / 3, startCol + (2 * (size / 3)), size / 3);
            solve(startRow + (2 * (size / 3)), startCol, size / 3);
            solve(startRow + (2 * (size / 3)), startCol + size / 3, size / 3);
            solve(startRow + (2 * (size / 3)), startCol + (2 * (size / 3)), size / 3);
        }else {
            ++ans[num + 1];
        }
    }
}