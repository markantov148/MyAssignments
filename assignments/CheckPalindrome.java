package week1.assignments;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		int input=sc.nextInt();
		int output=0,rem,original = input;
		for(int i=input;i>0;i/=10) {
			rem=i%10;
			output=(output*10)+rem;
		}
		if(original==output) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome (since the reversed number, "+output+" is not the same as original) ");
		}

	}

}
