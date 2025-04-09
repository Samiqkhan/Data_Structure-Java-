import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char a[]= name.toCharArray();
        int len=name.length();
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    char tem=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tem;
                }
            }
        }
        for(int i=0;i<len;i++)
        {
            System.out.print(a[i]);
        }
    }
}
