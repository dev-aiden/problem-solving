public class SieveOfEratosthenes {

    static int arr[] = new int[103];

    public static void main(String[] args) {
        for(int i = 2; i <= 100; ++i) {
            if(arr[i] == 0) arr[i] = 1;
            for(int j = i * 2; j <= 100; j += i) {
                arr[j] = 2;
            }
        }
    
        for(int i = 2; i <= 100; ++i) {
            if(arr[i] == 1) System.out.println(i);
        }
    }
}