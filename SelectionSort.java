class Sorting {
    void sort(int arr[]) {
        int temp;
        int change;

        for(int i = 0; i < arr.length - 1; i++) {
            temp = i;

            for(int j = i + 1; j < arr.length; j++) {
                if(arr[temp] > arr[j]) {
                    temp = j;
                }
            }

            change = arr[temp];
            arr[temp] = arr[i];
            arr[i] = change;
        }
    }
}

public class SelectionSort{
    public static void main(String args[]) {
        int[] arr = {-1, 1, 0, 2, 3, 4, 5, 1, -5, -2};

        Sorting s = new Sorting();
        s.sort(arr);

        for(int a : arr)
            System.out.print(a + " ");
    }
}
