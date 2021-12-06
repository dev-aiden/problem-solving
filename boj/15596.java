public class Test {
    long sum(int[] a) {
        int len = a.length;
        long ans = 0;
        for(int i = 0; i < len; ++i) ans += a[i];
        return ans;
    }
}
