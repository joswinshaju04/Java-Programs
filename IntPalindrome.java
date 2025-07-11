/* 
 * Title: Integer Palindrome
 * Author : Joswin Shaju
 * Date : 11/07/2025
 */

package prgms;

import java.util.Scanner;

public class IntPalindrome {
	public static void main(String [] arg) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int number=sc.nextInt();
		int origin=number;
		int rev=0,rem;
		while(number>0) {
			rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		if(origin==rev) {
			System.out.println("The number is a palindrome");
		}
		else {
			System.out.println("Its not a palindrome");
		}
	}

}
