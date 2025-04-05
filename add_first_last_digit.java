import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a = n/1000;
        int b = n%10;
        System.out.println(a+b);
    }
}
