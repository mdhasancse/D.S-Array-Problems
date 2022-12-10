import java.util.Arrays;

public class cyclicRotation {
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        cyclcicArr(arr);
    }
    public static void cyclcicArr(int[] arr)
    {
        int i=0;
        int j = arr.length-1;

        while(i != j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
