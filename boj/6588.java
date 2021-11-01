import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class Main {

    static Vector<Integer> prime = new Vector<>();
    static int[] check = new int[1000003];

    public static void main(String[] args) throws IOException {
        check[1] = 1;
        for(int i = 2; i <= 1000000; ++i) {
            if(check[i] == 0) {
                prime.add(i);
                for(int j = i + i; j <= 1000000; j += i) {
                    check[j] = 1;
                }
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int len = prime.size();
        while(true) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) break;
            for(int i = 0; i < len; ++i) {
                if(check[num - prime.get(i)] == 0) {
                    sb.append(num).append(" = ").append(prime.get(i)).append(" + ").append(num - prime.get(i)).append("\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
