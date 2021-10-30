package Stacks;
import java.util.*;
//  we have a series of n daily price quotes for a stock and we need to calculate span of stock’s price
//  for all n days
//  The span Si of the stock’s price on a given day i is defined as the maximum number of
//   consecutive days just before the given day, for which the price of the stock on the
//   current day is less than or equal to its price on the given day.
//For example, if an array of 7 days prices is given as
// {100, 80, 60, 70, 60, 75, 85},
// then the span values for corresponding 7 days are
// {1, 1, 1, 2, 1, 4, 6}

// Note the term consecutive
//Also current item is always included

public class StockSpanProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []arr= new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        span(arr,n);


    }
    public static void span(int[]arr, int n)
    {
        //we push indices in stack
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        System.out.print(1+" ");
        for(int i=1;i<n;i++)
        {
            while(!stack.isEmpty() && arr[i]>=arr[stack.peek()])
                stack.pop();
            int span=(stack.isEmpty())? (i+1): (i-stack.peek());
            System.out.print(span+" ");
            stack.push(i);
        }

    }

}
