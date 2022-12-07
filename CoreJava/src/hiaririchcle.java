class A2{
	int a=10;
	void A(){
		System.out.println("a="+a);
	}
}
class B2 extends A2{
	int b=20;
	void B2() {
		System.out.println("B= "+b);
		System.out.println("A="+a);
	}
}
class C2 extends A2{
	int c=30;
	void C() {
		System.out.println("C="+c);
		System.out.println("A="+a);

	}
}
public class hiaririchcle {
	public static void main(String[] args) {
		B2 b1 =new B2();
		C2 c1 =new C2();
	}
	
}
