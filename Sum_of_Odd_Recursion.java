import java.io.*;
import java.util.*;

public class Solution {
    public static int sum(int n,int a[])
    {
        
        if(n==0)
        {
            return 0;
        }
        else if(a[n-1]%2==0)
        {
            return n--;
        }
        else{
            return a[n-1]+sum(n-1,a);
        }
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int fo=sum(n,a);
        System.out.println("Sum = "+fo);
    }
}
