import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch[]= s.toCharArray();
        int n = s.length();
        for(int i=0;i<n-1;i++)
        {
            char temp = ch[i];
            ch[i]=ch[i+1];
            ch[i+1]= temp;
            i++;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(ch[i]);
        }
    }
}
