import java.io.*;
import java.util.*;

public class Solution {
    public static int pow(int a,int b)
    {
        if(b==1)
        {
            return a;
        }
        else{
            return a*pow(a,b-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int fo=pow(a,b);
        System.out.println("The value of "+a+" power "+b+" is "+fo);
    }
}
