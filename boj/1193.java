import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int sum = 1, next = 2;
        while(sum < x) {
            sum += next;
            ++next;
        }
        --next;
        if(next % 2 == 0) System.out.println((next - sum + x) + "/" + (1 + sum - x));
        else System.out.println((1 + sum - x) + "/" + (next - sum + x));
    }
}
