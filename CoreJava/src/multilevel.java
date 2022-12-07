import java.util.Scanner;

class A1
{
	int a;
	void getA()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A:");
		a=sc.nextInt();
	}
	void putA()
	{
		System.out.println("A : "+a);
	}
}
class B1 extends A1
{
	int b;
	void getB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter B:");
		b=sc.nextInt();
	}
	void putB()
	{
		System.out.println("B : "+b);
	}
}
class C1 extends B1{
	int c;
	void getC()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter C:");
		c=sc.nextInt();
	}
	void putC()
	{
		System.out.println("C : "+c);
	}
	
}
public class multilevel {

	public static void main(String[] args) {
		C1 b1=new C1();
		b1.getA();
		b1.getB();
		b1.getC();
		b1.putA();
		b1.putB();
		b1.putC();
	}
}
