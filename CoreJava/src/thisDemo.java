class Student
{
	int rno;
	String sname;
	
	public Student() {
		System.out.println("Default Constructor");
	}
	public Student(int rno,String sname) {
		this();
		this.rno=rno;
		this.sname=sname;
	}
	void display(Student s)
	{
		System.out.println("ROll No : "+s.rno);
		System.out.println("Student Name : "+s.sname);
	}
	void show()
	{
		this.display(this);
	}
}

public class thisDemo {

}
