package week1.assignments;

import java.util.Scanner;

public class FibSeries {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		int first=0, second=1;
		System.out.println("Input Range"+range);
		System.out.println(first+"\n"+second);
		for(int next=first+second;next<=range;next=first+second) {
			System.out.println(next);
			first=second;
			second=next;
		}
		sc.close();

	}

}

