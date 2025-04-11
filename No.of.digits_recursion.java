import java.io.*;
import java.util.*;

public class Solution {
    
    public static int num(int n,int i){
        if(n==0)
        {
            return 0;
        }
        else{
            return (i+1)+num(n/10,i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int f=num(n,i);
        System.out.println("The number of digits in "+n+" is "+f);
    }
}
