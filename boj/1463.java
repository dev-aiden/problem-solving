import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] d = new int[1000003];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(op(n));
    }

    public static int op(int num) {
        if(num == 1) return 0;
        if(d[num] > 0) return d[num];
        d[num] = op(num - 1) + 1;
        if(num % 2 == 0) {
            int temp = op(num / 2) + 1;
            if(d[num] > temp) d[num] = temp;
        }
        if(num % 3 == 0) {
            int temp = op(num / 3) + 1;
            if(d[num] > temp) d[num] = temp;
        }
        return d[num];
    }
}
