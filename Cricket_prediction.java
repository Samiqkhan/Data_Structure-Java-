import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mb = sc.nextInt();
        int mr = sc.nextInt();
        int cr = sc.nextInt();
        int cb = sc.nextInt();
        int tov = mb/6;
        int ovf1 = cb/6;
        int ovf2 = cb%6;
        float ovf = ovf1+(float)(0.1*ovf2);
        float crr = cr/ovf;
        float mrr = mr/(float)tov;
        System.out.println(tov);
        System.out.printf("%.1f\n",ovf);
        System.out.printf("%.1f\n",crr);
        System.out.printf("%.1f\n",mrr);
       
        
        if(mrr>crr)
        {
            System.out.println("Not Eligible to Win");
        }
        else
        {
            System.out.println("Eligible to Win");
        }
        
    }
}
