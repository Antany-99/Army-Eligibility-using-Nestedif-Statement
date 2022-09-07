package Learning1;
import java.util.Scanner;
public class ArmyEligible {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("If you are Male press 1");
		System.out.println("If you are Female press 2");
		int n=s.nextInt();
		if(n==1) {
			System.out.println("Your Age");
			int a=s.nextInt();
			System.out.println("Your Weight in KG");
			int b=s.nextInt();
			System.out.println("Your height in CM");
			int c=s.nextInt();
			if((a>20)&&(a<35)&&(b>50)&&(b<70)&&(c>150)&&(c<200)) {
				System.out.println("You are Eligible for Army,Navy,Airforce");}
			else {
				System.out.println("You are Not Eligible for Army,Navy,Airforce");}
		}
		else if(n==2) {
			System.out.println("Your Age");
			int a=s.nextInt();
			System.out.println("Your Weight in KG");
			int b=s.nextInt();
			System.out.println("Your height in CM");
			int c=s.nextInt();
			if((a>20)&&(a<30)&&(b>40)&&(b<70)&&(c>130)&&(c<200)) {
				System.out.println("You are Eligible for Army,Navy,Airforce");}
			else {
				System.out.println("You are Not Eligible for Army,Navy,Airforce");}
		}
	}

}
