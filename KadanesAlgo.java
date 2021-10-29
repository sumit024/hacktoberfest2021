package Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class KadaneAlgo {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of test cases");
        int t= Integer.parseInt(br.readLine());

        while(t-- > 0)
        {
            System.out.println("Enter the size of array");
            int size=Integer.parseInt(br.readLine());
            System.out.println("Enter the array");
            String[] arrStr= ((String)br.readLine()).split("\\s+");
            int[]arr=new int[size];
            for(int i=0;i<size;i++)
            {
                arr[i]=Integer.parseInt(arrStr[i]);
            }
            maxSubArraySum(arr,size);

        }
    }

    private static void maxSubArraySum(int[] arr, int size) {
        int max_end_here=0, max_so_far=Integer.MIN_VALUE;
        int start=0, s=0, end=0;
        for(int i=0;i<size;i++)
        {
            max_end_here+=arr[i];
            if(max_so_far<max_end_here)
            {
                max_so_far=max_end_here;
                start=s;
                end=i;
            }
            if(max_end_here<0)
            {
                max_end_here=0;
                s=i+1;
            }
        }
        System.out.println("Subarray having maximum sum is ");
        for(int i=start;i<=end;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("maximum subarray sum is "+max_so_far);
    }
}
