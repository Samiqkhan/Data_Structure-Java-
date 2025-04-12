import java.io.*;
import java.util.*;

public class Solution 
{
    public static void bin(int n)
    {
        if(n>0)
        {
            bin(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        bin(n);
    }
}
