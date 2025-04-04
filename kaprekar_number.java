import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n*n;
        int t=n;
        int c=0;
        while(t!=0){
            c++;
            t=t/10;
        }
        int a = (int)(sq%(Math.pow(10,c)));
        int b = (int)(sq/(Math.pow(10,c)));

        if((a+b)==n){
            System.out.println("Kaprekar Number");
        }
        else{
            System.out.println("Not a Kaprekar Number");
        }
    }
}
