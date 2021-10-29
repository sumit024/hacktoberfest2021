import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BinarySearchIterating {
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
            System.out.println("Enter the element you want to search");
            int key=Integer.parseInt(br.readLine());
            System.out.println(key+" is found at "+binarySearchIterating(arr,size,key)+" index");

        }
    }

    private static int binarySearchIterating(int[] arr, int size, int key) {
        int low=0,high=size-1;
        while (low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key)
                high=mid-1;
            else
                low=mid+1;
        }

        return -1;
    }
}
