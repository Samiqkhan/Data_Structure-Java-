import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r1][c1];
        
        if(c==r1)
        {
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }
            int a3[][]=new int[r][c1];
            for(int i=0;i<r;i++)
            {
                
                for(int j=0;j<c1;j++)
                {
                    a3[i][j]=0;
                    for(int k=0; k<r;k++)
                    {
                        a3[i][j]=a3[i][j]+(a[k][j]*b[i][k]);
                    }
                }
            }
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(a3[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Invalid input");
        }
	}
}
