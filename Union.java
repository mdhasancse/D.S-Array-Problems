import java.util.Arrays;
import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2,4,6};
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i< nums1.length;i++)
        {
            set.add(nums1[i]); // it will store only non repeating item from nums1
        }
         for(int i=0; i< nums2.length;i++)
        {
            set.add(nums2[i]); //it will store only non repeating item from nums2
        }

        System.out.println(((set)));
        ;
        
    }

}