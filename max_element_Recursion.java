import java.io.*;
import java.util.*;

public class Solution {
    public static int max(int n,int a[],int m){
        if(n==1)
        {
            return m;
        }
        else if(a[n-1]>m)
        {
            return max(n-1,a,m=a[n-1]);
        }
        else
        {
            return max(n-1,a,m);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int m=0;
        int fo=max(n,a,m);
        System.out.println("Maximum element in the array is "+fo);
    }
}
