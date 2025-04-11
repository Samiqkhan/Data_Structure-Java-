import java.io.*;
import java.util.*;

public class Solution {
    static int a=1;
    public static void fact(int n){
        if(n==1)
        {
            return;
        }
        else
        {
            a = a*n;
            fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fact(n); 
        System.out.println("The factorial of "+n+" is "+a);
    }
}
