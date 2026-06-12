class Sort{
	void sort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}arr[j+1]=temp;
		}
	}
}



public class InsertionSort{

    public static void main(String args[]) {

        int[] arr = {3, 2, 1, 4, 5, 6, 9, 8, 1, 2};

        Sort b = new Sort();
        b.sort(arr);

        for (int a : arr)
            System.out.print(a + " ");
    }
}
