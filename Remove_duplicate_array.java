import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    for(int k=j;k<n-1;k++)
                    {
                        a[k]=a[k+1];
                    }
                    n--;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
