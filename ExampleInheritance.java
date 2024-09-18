package Inheritance;
import java.util.*;
class Phone{
	void makeCall(){
		System.out.println("Making a phone call...");
	}
}
class SmartPhone extends touchPhone{
	void touch() {
		System.out.println("Using touch screen...");
	}}
	class touchPhone extends Phone{
	
	void internet() {
		System.out.println("Browsing the internet...");
	}
}
public class ExampleInheritance{
	public static void main(String[] args) {
		SmartPhone b = new SmartPhone();
		b.makeCall();
		b.touch();
		b.internet();
	}
}
