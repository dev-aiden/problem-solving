import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Score[] score = new Score[n];
        for(int i = 0; i < n; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            score[i] = new Score(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(score);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; ++i) sb.append(score[i].name).append("\n");
        System.out.println(sb);
    }

    static class Score implements Comparable<Score> {
        private String name;
        private int kor;
        private int eng;
        private int math;

        public Score(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        @Override
        public int compareTo(Score o) {
            if(this.kor == o.kor) {
                if(this.eng == o.eng) {
                    if(this.math == o.math) {
                        return this.name.compareTo(o.name);
                    }
                    return o.math - this.math;
                }
                return this.eng - o.eng;
            }
            return o.kor - this.kor;
        }
    }
}
