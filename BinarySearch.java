package practice;


class Search{
	int get(int arr[],int find) {
		int left=0;
		int right=arr.length-1;
		int mid;
		while(left<=right) {
			mid=(left+right)/2;
			if(arr[mid]==find) {
				return mid;
			}
			else if(arr[mid]>find)
				right=mid-1;
			else
				left=mid+1;
				
				
		}
		return 0;
	}
}

public class BinarySearch{
    public static void main(String args[]) {
    	int[] arr= {99,28,90,4,78};
    	Search finder=new Search();
    	int c=finder.get(arr,90);
    	System.out.print(c);
    }
}
