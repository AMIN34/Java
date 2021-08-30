import java.util.Arrays;
public class CheckingArrayUtil {
    public static void main(String[] args) {
        int arr[]={4,-9,5,2,-10,0,3};
        Arrays.sort(arr);
        for(int num:arr)
        System.out.println(num);
        System.out.println();
        System.out.println(Arrays.binarySearch(arr, 0));
    }
}
