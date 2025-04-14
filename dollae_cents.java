import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1= sc.nextInt();
        int c1= sc.nextInt();
        int d2= sc.nextInt();
        int c2= sc.nextInt();
        int dsum = d1+d2;
        int csum = c1+c2;
        if(csum>=100)
        {
            int a = csum/100;
            dsum+=a;
            csum = csum%100;
        }
        System.out.println(dsum);
        System.out.println(csum);
    }
}
