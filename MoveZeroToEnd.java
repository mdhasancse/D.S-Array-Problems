import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args)
    {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        int n = nums.length;
        if(n==0 || n==1)
        return;
        while(j < n)
        {
            if(nums[j] == 0)
            {
                j++;
            }else
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        } 
        System.out.println(Arrays.toString(nums));
    }
}

