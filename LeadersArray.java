import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
//the extreme right element is always leader
public class LeaderInAnArray {
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
            findLeader(arr,size);

        }
    }

    private static void findLeader(int[] arr, int size) {
        int curr_leader=arr[size-1];
        System.out.print(curr_leader+" ");
        for(int i=size-2;i>=0;i--)
        {
            if(arr[i]>curr_leader)
            {
                curr_leader=arr[i];
                System.out.print(curr_leader+" ");
            }
        }
    }
}
