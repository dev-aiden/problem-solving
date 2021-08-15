public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};

        System.out.print("정렬 전 : ");
        for(int i = 0; i < 5; ++i) System.out.print(arr[i] + " ");
        System.out.println();

        bubbleSortAscending(arr);
        bubbleSortDescending(arr);
    }

    public static void bubbleSortAscending(int[] arr) {
        int[] arr2 = arr.clone();
        int size = arr2.length - 1;

        for(int i = 0; i < size; ++i) {
            for(int j = 0; j < size - i; ++j) {
                if(arr2[j] > arr2[j + 1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                }
            }
        }

        System.out.print("오름차순 정렬 후 : ");
        for(int i = 0; i < 5; ++i) System.out.print(arr2[i] + " ");
        System.out.println();
    }

    public static void bubbleSortDescending(int[] arr) {
        int[] arr2 = arr.clone();
        int size = arr2.length - 1;

        for(int i = 0; i < size; ++i) {
            for(int j = 0; j < size - i; ++j) {
                if(arr2[j] < arr2[j + 1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                }
            }
        }

        System.out.print("오름차순 정렬 후 : ");
        for(int i = 0; i < 5; ++i) System.out.print(arr2[i] + " ");
        System.out.println();
    }
}
