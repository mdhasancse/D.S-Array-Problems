import java.util.Arrays;
public class moveNegativeNo {   
    public static void main(String[] args)
    {
        int[] nums = {-1,1,-4,3,12, -8};
        moveNegative(nums);
    }
    public static void moveNegative(int[] nums) {
        int i=0;
        int j=0;
        int n = nums.length;
        if(n==0 || n==1)
        return;
        while(j < n)
        {
            if(nums[j] > 0)
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


    

