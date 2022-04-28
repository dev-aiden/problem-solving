import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static class Meeting implements Comparable<Meeting> {
        int begin, end;

        Meeting(int begin, int end) {
            this.begin = begin;
            this.end = end;
        }

        @Override
        public int compareTo(Meeting o) {
            if(this.end == o.end) return Integer.compare(this.begin, o.end);
            return Integer.compare(this.end, o.end);
        }
    }

    static List<Meeting> list = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list.add(new Meeting(b, e));
        }
        Collections.sort(list);
        int ans = 0;
        int temp = 0;
        for(int i = 0; i < n; ++i) {
            if(temp <= list.get(i).begin) {
                temp = list.get(i).end;
                ++ans;
            }
        }
        System.out.println(ans);
    }
}