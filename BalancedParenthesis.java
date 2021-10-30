package Stacks;
import java.util.*;
public class BalancedParenthesis {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(checkBalancedParenthesis(s));

    }
    public static boolean checkBalancedParenthesis(String str)
    {
        Stack<Character>stack= new Stack<>();
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{')
                stack.push(ch);
            else
            {
                if(stack.isEmpty())
                    return false;
                char check;
                switch (ch)
                {
                    case(')'):
                    {
                        check=stack.pop();
                        if(check =='{' ||check =='[')
                            return false;
                        break;
                    }
                    case('}'):
                    {
                        check=stack.pop();
                        if(check =='(' ||check =='[')
                            return false;
                        break;
                    }
                    case(']'):
                    {
                        check=stack.pop();
                        if(check =='(' ||check =='{')
                            return false;
                        break;
                    }

                }
            }
        }
        return stack.isEmpty();
    }
}
