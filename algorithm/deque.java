import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DequeExample {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int arr[] = new int[20003];
        int begin = 10000, end = 10001;
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if(cmd.equals("push_front")) {
                int num = Integer.parseInt(st.nextToken());
                arr[begin--] = num;
            } else if(cmd.equals("push_back")) {
                int num = Integer.parseInt(st.nextToken());
                arr[end++] = num;
            } else if(cmd.equals("pop_front")) {
                if(begin == end - 1) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(arr[++begin]).append("\n");
                    arr[begin] = 0;
                }
            } else if(cmd.equals("pop_back")) {
                if(begin == end - 1) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(arr[--end]).append("\n");
                    arr[end] = 0;
                }
            } else if(cmd.equals("size")) {
                sb.append(end - begin - 1).append("\n");
            } else if(cmd.equals("empty")) {
                sb.append(begin == end - 1 ? 1 : 0).append("\n");
            } else if(cmd.equals("front")) {
                sb.append(begin == end - 1 ? -1 : arr[begin + 1]).append("\n");
            } else if(cmd.equals("back")) {
                sb.append(begin == end - 1? -1 : arr[end - 1]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
