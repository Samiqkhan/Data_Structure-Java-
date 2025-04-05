import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        System.out.println(Math.round(Math.floor(num)));
        System.out.println(Math.round(Math.ceil(num)));
        System.out.println(Math.round(Math.floor(num)));
    }
}
