import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= a%10;
        int c=a/1000;
        int d=b+c;
        System.out.println(d);
    }
}
