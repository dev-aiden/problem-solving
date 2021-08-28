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
        int index, key;

        for(int i = 1; i < size; ++i) {
            index = i;
            key = arr2[i];
            for(int j = i - 1; j >= 0; --j) {
                if(key < arr2[j]) {
                    arr2[j + 1] = arr2[j];
                    index = j;
                }
            }
            arr2[index] = key;
        }

        System.out.print("오름차순 정렬 후 : ");
        for(int i = 0; i < 5; ++i) System.out.print(arr2[i] + " ");
        System.out.println();
    }

    public static void selectionSortDescending(int[] arr) {
        int[] arr2 = arr.clone();
        int size = arr2.length;
        int index, key;

        for(int i = 1; i < size; ++i) {
            index = i;
            key = arr2[i];
            for(int j = i - 1; j >= 0; --j) {
                if(key > arr2[j]) {
                    arr2[j + 1] = arr2[j];
                    index = j;
                }
            }
            arr2[index] = key;
        }

        System.out.print("내림차순 정렬 후 : ");
        for(int i = 0; i < 5; ++i) System.out.print(arr2[i] + " ");
        System.out.println();
    }
}
