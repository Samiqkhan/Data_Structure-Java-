import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    String name = sc.nextLine();
	    char ch[]=name.toCharArray();
	    int len = name.length();
	    for(int i=0;i<len;i++)
	    {
	        if(ch[i]>='a' && ch[i]<='z')
	        {
	        ch[i]=(char)((int)ch[i]-32);
	        }
	    }
	    String re = new String(ch);
	    System.out.println(re);
	}
}
