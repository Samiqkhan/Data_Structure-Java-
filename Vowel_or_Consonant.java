import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch=='A' || ch =='a' || ch == 'E' || ch == 'e' || ch=='I' || ch=='i' || ch=='O' || ch =='o' || ch == 'U' || ch == 'u'){
            System.out.println("Vowel");
        }
        else if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
            System.out.println("Consonant");
        }
        else{
            System.out.println("Not an alphabet");
        }
    }
}
