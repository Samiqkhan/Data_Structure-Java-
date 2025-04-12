import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String arr[]=new String[10];
        boolean flag= true;
        int i=0;
        while(flag)
        {
            arr[i]=sc.nextLine();
            if(arr[i].endsWith("####"))
            {
                flag=false;
            }
            i++;
        }
        for(int k=0;k<10;k++)
        {
            if(arr[k].charAt(arr[k].length()-1) == arr[k+1].charAt(0))
            {
                System.out.println(arr[k]);
            }
            else
            {
                System.out.println(arr[k]);
                break;
            }
        }
    }
}
