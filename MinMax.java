public class MinMax {
    public static void main(String[] args) {
        int[] arr = {3,5,4,1,9};
        FindMinMax(arr);
    }
    static void FindMinMax(int[] arr)
    {
        if(arr == null || arr.length ==0)
        {
            return ;
        }
        int min = arr[0];
        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Minimum "+min);
        System.out.println("Maximum "+max);
    }
}
