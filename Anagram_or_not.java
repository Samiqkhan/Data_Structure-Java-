import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String n1= sc.nextLine();
        char a1[]= n1.toCharArray();
        int l1=n1.length();
        String n2=sc.nextLine();
        char a2[]=n2.toCharArray();
        int l2=n2.length();
        int flag=0;
        int f1[]=new int[256];
        int f2[]=new int[256];
        if(l1==l2)
        {
            for(int i=0;i<l1;i++)
            {
                f1[a1[i]]++;
                f2[a2[i]]++;
            }
            for(int i=0;i<256;i++)
            {

                if(f1[i]!=f2[i])
                {
                    flag=1;
                    break;
                }
                   
            }
            if(flag==0)
            {
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }
        }
    }
}
