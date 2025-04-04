import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i=row;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
