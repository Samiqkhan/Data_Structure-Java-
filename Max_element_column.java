import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int math;
        int [][]a=new int [r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<c;i++)
        {
            math=0;
            for(int j=0;j<r;j++)
            {
                if(a[j][i]>math)
                {
                    math=a[j][i];
                }
            }
            System.out.println(math);
        }
    }
}
