/* 
 * Title: Even num upto n
 * Author : Joswin Shaju
 * Date : 11/07/2025
 */

package prgms;

import java.util.Scanner;

public class EvenNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the limit: ");
		int limit=sc.nextInt();
		int i;
		for(i=2;i<limit;i+=2) {
			
			System.out.println(+i);
		}
		
		sc.close();		
	}

}
