import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(((a<c)&&(a>b))||((a>c)&&(a<b)))
        {
            System.out.println("The treasure is in the box which has the number "+a);
        }
        else if(((b<c)&&(b>a))||((b>c)&&(b<a)))
        {
            System.out.println("The treasure is in the box which has the number "+b);
        }
        else if(((c<a)&&(c>b))||((c>a)&&(c<b)))
        {
            System.out.println("The treasure is in the box which has the number "+c);
        }
        if((b%a==0)&&(c%a==0))
        {
            System.out.println("The code to open the box is "+a);

        }
        else if((b%c==0)&&(a%c==0))
        {
            System.out.println("The code to open the box is "+b);

        }
        else if((a%b==0)&&(c%b==0))
        {
            System.out.println("The code to open the box is "+b);

        }
        else
        {
            System.out.println("The code to open the box is 1");

        }
    }
}
