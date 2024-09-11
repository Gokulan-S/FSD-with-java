package oops;
import java.util.Scanner;
class Details{
	String name;
	int roll;
	String dept;
	String mail;
	String gender;
	int markPer;
	int age;
	void display() {
		System.out.println(name);
		System.out.println(roll);
		System.out.println(dept);
		System.out.println(mail);
		System.out.println(gender);
		System.out.println(markPer);
		System.out.println(age);	
	}
	
}

public class Userdetail {
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		Details ob=new Details();
		System.out.println("enter name");
		ob.name=s.nextLine();
		System.out.println("enter rollno");
		ob.roll=s.nextInt();
		s.nextLine();
		System.out.println("enter dept");
		ob.dept=s.nextLine();
		
		System.out.println("enter mail");
		ob.mail=s.nextLine();
		
		System.out.println("enter gender");
		ob.gender=s.nextLine();
		
		System.out.println("enter markPer");
		ob.markPer=s.nextInt();
		
		System.out.println("enter age");
		ob.age=s.nextInt();
		s.close();
		ob.display();
		
	}
}




//name rollno dept mail address gender marks age
