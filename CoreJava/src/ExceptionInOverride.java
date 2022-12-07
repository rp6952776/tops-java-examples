import java.util.InputMismatchException;

class ex1
{
	void show() throws ArithmeticException
	{
		System.out.println("Show From ex1");
	}
}
class ex2 extends ex1
{
	void show() throws InputMismatchException
	{
		System.out.println("Show From ex2");
	}
}
public class ExceptionInOverride {

}
