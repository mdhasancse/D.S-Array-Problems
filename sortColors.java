import java.util.Arrays;

public class sortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);

    }
    public static void sortColors(int[] nums) {
        int l=0;
        int m = 0;
        int h = nums.length-1;
        while( m <= h)
        {
            if (nums[m] == 2)
            {
               int temp = nums[m];
                nums[m] = nums[h];
                nums[h] = temp;
                h--;
            }
            else if(nums[m] == 1)
            {
                m++;
            }
            else if(nums[m] == 0)
            {
            int temp = nums[l];
                nums[l] = nums[m];
                nums[m] = temp;
                l++;
                m++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    
}
