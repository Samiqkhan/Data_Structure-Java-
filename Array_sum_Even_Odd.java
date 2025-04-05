import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int [10];
        int s1=0;
        int s2=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            {
                s1 = s1+ a[i];
            }
            else
            {
                s2= s2+a[i];
            }
        }
        System.out.println("The sum of the even numbers in the array is "+s1);
        System.out.println("The sum of the odd numbers in the array is "+s2);
    }
}
