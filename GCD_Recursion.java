import java.io.*;
import java.util.*;

public class Solution {
    public static int gcd(int a,int b,int i)
    {
        if(a%i==0 && b%i == 0)
        {
            return i;
        }
        else
        {
            return gcd(a,b,i-1);
        }
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        int i;
        if(a<b)
        {
            i=a;
        }
        else
        {
            i=b;
        }
        int f=gcd(a,b,i);
        System.out.println(f);
    }
}
