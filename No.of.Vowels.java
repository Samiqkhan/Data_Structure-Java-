import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char ch[]= name.toCharArray();
        int len = name.length();
        int c=0;
        for(int i=0;i<len;i++)
        {
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U' )
            {
                c++;                
            }
            else
            {

            }
        }
        System.out.println("Number of vowels: "+c);
    }
}
