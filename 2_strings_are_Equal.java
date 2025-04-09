import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char ch[] = name.toCharArray();
		int len = name.length();
		String name2 = sc.nextLine();
		char ch2[] = name2.toCharArray();
		int len2= name2.length();
		int flag =0;
		if(len==len2)
		{
		    for(int i=0;i<len;i++)
		    {
		        if(ch[i]!=ch2[i])
		        {
		            flag=1;
		            break;
		        }
		    }
		    if(flag==0)
		    {
		        System.out.println("All Strings are Equal");
		    }
		    else{
		        System.out.println("Not Equal");
		    }
		}
		else
		{
		    System.out.println("Invalid Input");
		}
	}
}
