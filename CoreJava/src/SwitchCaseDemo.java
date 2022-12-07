import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		do {
			System.out.print("Enter A : ");
			a=sc.nextInt();
			System.out.print("Enter B : ");
			b=sc.nextInt();
			
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.print("Enter YOur Choice : ");
			d=sc.nextInt();
			
			switch(d)
			{
				case 1:
					c=a+b;
					System.out.println("Addition : "+c);
					break;
				case 2:
					c=a-b;
					System.out.println("Subtraction : "+c);
					break;
				case 3:
					c=a*b;
					System.out.println("Multiplication : "+c);
					break;
				case 4:
					c=a/b;
					System.out.println("Division : "+c);
					break;
				case 5:
					flag=false;
					break;
				default:
					System.out.println("Invalid Choice");
					break;
			}
		}while(flag);
	}
}
