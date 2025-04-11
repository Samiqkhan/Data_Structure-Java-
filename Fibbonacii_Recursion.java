import java.io.*;
import java.util.*;

public class Solution {
    public static int fib(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int fo=fib(n);
        System.out.println("The term "+n+" in the Fibonacci series is "+fo);
    }
}
