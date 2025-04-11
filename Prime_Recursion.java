import java.io.*;
import java.util.*;

public class Solution {
    
    public static Boolean prime(int n, int i){
        if(i ==1){
            return true;
        }
        else if(n%i==0)
        {
            return false;
        }
        else
        {
            return prime(n,i-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Boolean fo=prime(n,n/2);
        if(fo==true)
        {
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        } 
    }
}
