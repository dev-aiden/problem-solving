import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] inorder = new int[100003];
    static int[] postorder = new int[100003];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; ++i) inorder[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; ++i) postorder[i] = Integer.parseInt(st.nextToken());
        solve(0, n - 1, 0, n - 1);
        sb.append("\n");
        System.out.println(sb);
    }

    static void solve(int inStart, int inEnd, int postStart, int postEnd) {
        if(inStart > inEnd || postStart > postEnd) return;
        int rootIndex = 0;
        for(int i = inStart; i <= inEnd; ++i) {
            if(inorder[i] == postorder[postEnd]) {
                rootIndex = i;
                break;
            }
        }
        sb.append(postorder[postEnd]).append(" ");
        solve(inStart, rootIndex - 1, postStart, postStart + rootIndex - inStart - 1);
        solve(rootIndex + 1, inEnd, postStart + rootIndex - inStart, postEnd - 1);
    }

}
