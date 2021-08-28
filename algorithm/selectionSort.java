public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};

        System.out.print("정렬 전 : ");
        for(int i = 0; i < 5; ++i) System.out.print(arr[i] + " ");
        System.out.println();

        selectionSortAscending(arr);
        selectionSortDescending(arr);
    }

    public static void selectionSortAscending(int[] arr) {
        int[] arr2 = arr.clone();
        int size = arr2.length;

        for(int i = 0; i < size - 1; ++i) {
            for(int j = i + 1; j < size; ++j) {
                if(arr2[i] > arr2[j]) {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        System.out.print("오름차순 정렬 후 : ");
        for(int i = 0; i < 5; ++i) System.out.print(arr2[i] + " ");
        System.out.println();
    }

    public static void selectionSortDescending(int[] arr) {
        int[] arr2 = arr.clone();
        int size = arr2.length;

        for(int i = 0; i < size - 1; ++i) {
            for(int j = i + 1; j < size; ++j) {
                if(arr2[i] < arr2[j]) {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        System.out.print(" 정렬 후 : ");
        for(int i = 0; i < 5; ++i) System.out.print(arr2[i] + " ");
        System.out.println();
    }
}
