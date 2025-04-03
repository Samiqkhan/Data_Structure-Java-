import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val =n;
        int s =0;
        while(n!=0){
            int l = n%10;
            int p=1;
            for (int i=2;i<=l;i++){
                p=p*i;
            }
            s = s+p;
            n = n/10;
        }
        if(s==val){
            System.out.println("Yes");
        }
    }
}
