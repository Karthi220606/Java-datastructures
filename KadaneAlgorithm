class MaximumSubArray {

    int find(int[] arr) {
        int currsum = arr[0];
        int maxsum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int temp = currsum + arr[i];

            if (temp < arr[i]) {
                currsum = arr[i];
            } else {
                currsum = temp;
            }

            if (maxsum < currsum) {
                maxsum = currsum;
            }
        }

        return maxsum;
    }
}

public class KadaneAlgorithm{
    public static void main(String[] args) {

        int[] arr = {-1, 1, 0, 2, 3, 4, 5, 1, -5, -2};

        MaximumSubArray msa = new MaximumSubArray();
        System.out.println("Maximum Subarray Sum: " + msa.find(arr));
    }
}
