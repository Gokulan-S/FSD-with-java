import java.util.Scanner;
public class ArmstrongNumber {
	static boolean isArmstrongNumber(int number) {
		String digits=Integer.toString(number);
		int numDigits=digits.length();
		int sum=0;
		for(int i=0;i<numDigits;i++) {
			int digit=Character.getNumericValue(digits.charAt(i));
			sum+=Math.pow(digit, numDigits);
		}
		return sum==number;
	}
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number");
		int number=s.nextInt();
		if(isArmstrongNumber(number)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
