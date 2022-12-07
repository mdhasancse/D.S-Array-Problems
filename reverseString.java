import java.util.Arrays;

public class reverseString
{
    public static void main(String[] args)
    {
        String[] s = {"h","e","l","l","o"};
        
    }
    public void reverseString(char[] s, int i,int j) {
        i=0;
        j = s.length-1;
        while(i < j)
        {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        
    }
}