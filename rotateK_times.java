import java.util.Arrays;

import javax.swing.event.SwingPropertyChangeSupport;

public class rotateK_times {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
    }

    private static void reverse(int[] nums,int i,int j)
    {
        while(i < j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public  static void rotate(int[] nums, int k) {
        if(nums.length == 0 || k < 1){
            return;
        }
        k = k%nums.length;
        reverse(nums, 0, nums.length - 1); // rotate all items        
        reverse(nums, 0, k-1); // rotate from 0 to k-1
        reverse(nums, k, nums.length - 1); // Step 1: rotate from k to last items
        
        System.out.println(Arrays.toString(nums));
    }

}
