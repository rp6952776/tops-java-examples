class Base
{
	Base()
	{
		System.out.println("Base's Default Constructor");
	}
	void show()
	{
		System.out.println("Show From Base");
	}
}
class Derived extends Base
{
	Derived() 
	{
		System.out.println("Derived's Constructor");
	}
	void show()
	{
		super.show();
		System.out.println("Show From Derived");
	}
}
class SubDerived extends Derived
{
	SubDerived() {
		System.out.println("SubDerived's Constructor");
	}
	void show()
	{
		super.show();
		System.out.println("Show From SubDerived");
	}
}
public class ConstructorChaining {

	public static void main(String[] args) {
		SubDerived s=new SubDerived();
		s.show();
	}
}
