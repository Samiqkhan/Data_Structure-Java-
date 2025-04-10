import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		int n = cs.nextInt();
		int in=n;
		int r=0;
		int rn=0;
		for(;n!=0;n/=10)
		{
		    r=n%10;
		    rn=(rn*10)+r;
		}
		if(in==rn)
		{
		    System.out.println("Palindrome");
		}
		else{
		    System.out.println("Not Palindrome");
		}
	}
}
