import java.util.Scanner;

/*
 * if condition
 * 
 * 1. Simple If
 * 
 * 	if(condition)
 * 	{
 * 		statement;
 * 	}
 * 
 * 2. if/else
 * 
 * 	if(condition)
 * 	{
 * 		statement;
 * 	}
 * 	else
 * 	{
 * 		statement;
 * 	}
 * 
 * 3. Nested if
 * 
 * 	if(condition)
 * 	{
 * 		if(condition)
 * 		{
 * 			statement;
 * 		}
 * 		else
 * 		{
 * 			statement;
 * 		}
 * 	}
 * 	else
 * 	{
 * 		statement;
 * 	}
 * 
 * 4. Ladder if/else
 * 
 * 	if(condition)
 * 	{
 * 		statement;
 * 	}
 * 	else if(condition)
 * 	{
 * 		statement;
 * 	}
 * 	else if(condition)
 * 	{
 * 		statement;
 * 	}
 * 	else
 * 	{
 * 		statement;
 * 	}
 * */
public class IfCondition {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A:");
		a=sc.nextInt();
		System.out.print("Enter B:");
		b=sc.nextInt();
		System.out.print("Enter C:");
		c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A Is Max");
			}
			else
			{
				System.out.println("C Is Max");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("B Is Max");
			}
			else
			{
				System.out.println("C Is Max");
			}
		}
	}
}
