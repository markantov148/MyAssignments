package week1.assignments;

import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        boolean isPrime = true;

        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {  
                isPrime = false;
                break;
            }
        }

        if (isPrime && n > 1) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is a Non-Prime Number");
        }
        scanner.close();
    }
}
