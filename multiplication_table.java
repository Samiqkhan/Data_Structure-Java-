import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter n");
        System.out.println("Enter m");
        System.out.println("The multiplication table of 5 is");
        for(int i=1;i<=m;i++){
            System.out.println(i+"*"+n+"="+(i*n));
        }
    }
}
