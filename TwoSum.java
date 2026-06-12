class Solution{
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int req=target-nums[i];
            if(map.containsKey(req)){
                return new int[]{map.get(req),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}

public class TwoSum{
    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = sol.twoSum(nums, target);

        if (result.length == 0) {
            System.out.println("No pair found");
        } else {
            System.out.println("Index 1: " + result[0]);
            System.out.println("Index 2: " + result[1]);
        }
    }
}
