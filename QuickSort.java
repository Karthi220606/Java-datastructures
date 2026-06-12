class Q {

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (true) {

            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i >= j) {
                return j;
            }

            swap(arr, i, j);
            i++;
            j--;
        }
    }
}
public class QuickSort {

    Q qs = new Q();

    void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = qs.partition(arr, low, high);
            quicksort(arr, low, pivot);
            quicksort(arr, pivot + 1, high);
        }
    }

    public static void main(String args[]) {

        int[] arr = {5, 3, 7, 4, 0, 1, 2, 6, 8};

        QuickSort ns = new QuickSort();
        ns.quicksort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
