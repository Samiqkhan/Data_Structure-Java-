import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int x1=3;
        int y1=4;
        int diff1 = x-x1;
        int diff2 = y-y1;
        int f = ((diff1 * diff1)+(diff2*diff2));
        System.out.println((int)Math.floor(Math.sqrt(f)));
    }
}
