import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a= n-1;
        int r=(a/3);
        int c=(a%3);
        System.out.println(r+" "+c);
    }
}
