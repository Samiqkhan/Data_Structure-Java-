import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  total = sc.nextInt();
        int  a = sc.nextInt();
        int  b = sc.nextInt();
        int l = (a*total)/100;
        int r1= total-l;
        int bl = (b*r1)/100;
        int r2 = r1-bl;
        int p = r2/3;
        System.out.println(l);
        System.out.println(bl);
        System.out.println(p);
    }
}
