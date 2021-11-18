import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Number[] number = new Number[n];
        for(int i = 0; i < n; ++i) {
            int num = Integer.parseInt(br.readLine());
            number[i] = new Number(num, i);
        }
        Arrays.sort(number);
        int ans = 0;
        for(int i = 0; i < n; ++i) {
            if(number[i].index - i > ans) {
                ans = number[i].index - i;
            }
        }
        System.out.println(ans + 1);
    }

    static class Number implements Comparable<Number> {
        int num;
        int index;

        Number(int num, int index) {
            this.num = num;
            this.index = index;
        }

        @Override
        public int compareTo(Number o) {
            return num - o.num;
        }
    }
}
