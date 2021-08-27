import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length();
        int i = 0;
        while(i < len) {
            System.out.print(s.charAt(i));
            if(i % 10 == 9) System.out.println();
            ++i;
        }
    }
}
