package days3;

public class Student {
	int id;
	String fname;
	String lname;
	
	Student(){
		this.id=id;
		this.fname=fname;
		this.lname=lname;
	}
	void display()
	{
		System.out.print(id+" "+fname+lname);
	}
public static void main(String args[]) {
	Student s1=new Student();
	s1.id=3;
	s1.fname="sai";
	s1.lname="kiran";
	
	s1.display();
}

}
