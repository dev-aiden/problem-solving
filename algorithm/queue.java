import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QueueExample {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int arr[] = new int[10003];
        int begin = 0, end = 0;
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; ++i) {
            String cmd = br.readLine();
            StringTokenizer st = new StringTokenizer(cmd);
            if(st.nextToken().equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                arr[end++] = num;
            } else if(cmd.equals("pop")) {
                if(begin == end) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(arr[begin]).append("\n");
                    arr[begin++] = 0;
                }
            } else if(cmd.equals("size")) {
                sb.append(end - begin).append("\n");
            } else if(cmd.equals("empty")) {
                sb.append(begin == end ? 1 : 0).append("\n");
            } else if(cmd.equals("front")) {
                sb.append(begin == end ? -1 : arr[begin]).append("\n");
            } else if(cmd.equals("back")) {
                sb.append(begin == end ? -1 : arr[end - 1]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
