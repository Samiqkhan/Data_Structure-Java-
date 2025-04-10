import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        char ch[]=s1.toCharArray();
        int n1=s1.length();
        int sum=0;
        for(int i=0;i<n1;i++)
        {
            if(ch[i]> '0' && ch[i]<='9')
            {
                if(i+1<n1 && ch[i+1]>'0' && ch[i+1]<='9')
                {
                    sum = sum+((ch[i]-'0')*10);
                }
                else
                {
                    sum = sum + (ch[i])-'0';
                }
            }
        }
        System.out.println(sum);       
    }
}
