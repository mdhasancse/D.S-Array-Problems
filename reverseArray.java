import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(arr, 0, 0)));
    }

    public static int[] reverseArray(int[] arr, int i, int j)
    {
        i=0;
        j = arr.length-1;
        while(i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
        
    }
}
