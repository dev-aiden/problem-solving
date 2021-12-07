public class Main {

    static int[] arr = new int[100003];

    public static void main(String[] args) {
        for(int i = 1; i <= 10000; ++i) {
            int num = i;
            while((num = d(num)) <= 10000) arr[num] = 1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 10000; ++i) {
            if(arr[i] == 0) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }

    public static int d(int num) {
        int ret = num;
        while(num != 0) {
            ret += num % 10;
            num /= 10;
        }
        return ret;
    }
}
