import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BinarySearchRecursive {
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
            System.out.println(key+" is found at "+binarySearchRecursive(arr,0,size-1,key)+" index");

        }
    }

    private static int binarySearchRecursive(int[] arr,  int low, int high, int key) {


        if(high>=low)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key)
                return binarySearchRecursive(arr,low,mid-1,key);

            else
                return binarySearchRecursive(arr,mid+1,high,key);
        }
        return -1;
    }
}
