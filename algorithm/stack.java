import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StackExample {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int arr[] = new int[10003];
        int size = 0;
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; ++i) {
            String cmd = br.readLine();
            StringTokenizer st = new StringTokenizer(cmd);
            if(st.nextToken().equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                arr[size++] = num;
            } else if(cmd.equals("pop")) {
                if(size != 0) {
                    sb.append(arr[size - 1]).append("\n");
                    arr[(size--) - 1] = 0;
                } else {
                    sb.append("-1").append("\n");
                }
            } else if(cmd.equals("size")) {
                sb.append(size).append("\n");
            } else if(cmd.equals("empty")) {
                sb.append(size == 0 ? 1 : 0).append("\n");
            } else if(cmd.equals("top")) {
                sb.append(size == 0 ? -1 : arr[size - 1]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
