import java.util.Arrays;

public class max_Gap {
    public static void main(String[] args) {
        int[] nums = {3,6,9,1};
        System.out.println(maximumGap(nums));
    }
    public static int maximumGap(int[] nums) {
        if (nums.length < 2) 
           return 0;
       Arrays.sort(nums);
       int maximumGap = 0;
       for (int i = 1; i < nums.length; i++) {
           maximumGap = Math.max(maximumGap, nums[i] - nums[i - 1]);
       }
       return maximumGap;
    }
}
