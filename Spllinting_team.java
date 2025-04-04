import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a/b);
        int d = (a%b);
        System.out.println("The number of friends in each team is "+c+" and left out is "+d);
    }
}
