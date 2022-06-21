import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int arr[][] = new int[1003][1003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int minVal = 9999, minRow = 0, minCol = 0;
        for (int i = 0; i < r; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < c; ++j) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if ((i + j) % 2 == 1 && minVal > arr[i][j]) {
                    minVal = arr[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if (r % 2 != 0) {
            for (int i = 0; i < r; ++i) {
                for (int j = 0; j < c - 1; ++j) {
                    if (i % 2 == 0) sb.append("R");
                    else sb.append("L");
                }
                if(i != r - 1) sb.append("D");
            }
        } else if (c % 2 != 0) {
            for (int i = 0; i < c; ++i) {
                for(int j = 0; j < r - 1; ++j) {
                    if (i % 2 == 0) sb.append("D");
                    else sb.append("U");
                }
                if (i != c - 1) sb.append("R");
            }
        } else {
            int row = (minRow % 2 == 1) ? minRow - 1 : minRow;
            for (int i = 0; i < row; ++i) {
                for (int j = 0; j < c - 1; ++j) {
                    if (i % 2 == 0) sb.append("R");
                    else sb.append("L");
                }
                if (i != r - 1) sb.append("D");
            }
            boolean flag = true;
            for (int i = 0; i < c; ++i) {
                for (int j = row; j < row + 1; ++j) {
                    if (i == minCol) {
                        continue;
                    } else {
                        if (flag) sb.append("D");
                        else sb.append("U");
                        flag = !flag;
                    }
                    
                }
                if (i != c - 1) sb.append("R");
            }
            row += 2;
            if(row < r) sb.append("D");
            for (int i = row; i < r; ++i) {
                for (int j = 0; j < c - 1; ++j) {
                    if (i % 2 == 0) sb.append("L");
                    else sb.append("R");
                }
                if (i != r - 1) sb.append("D");
            }
        }
        sb.append("\n");
        System.out.println(sb);
    }
}
