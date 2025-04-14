import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float p = sc.nextFloat();
        float r=sc.nextFloat();
        float y = sc.nextFloat();
        float si = (p*r*y)/100;
        float t = si+p;
        float d = (si*2)/100;
        float ro= t-d;
        System.out.printf("%.2f\n",si);
        System.out.printf("%.2f\n",t);
        System.out.printf("%.2f\n",d);
        System.out.printf("%.2f\n",ro);
        
    }
}
