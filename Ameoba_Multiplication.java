import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        int a=0;
        int b=1;
        for(int i=0;i<(n-2);i++){
            c = a+b;
            a=b;
            b = c;
        }
        System.out.println(c);
    }
}
