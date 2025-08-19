/* 
 * Title: Input elements in array and find largest element
 * Author : Joswin Shaju
 * Date : 19/08/2025
 */


package array;

import java.util.Scanner;

public class DemoArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of N:");
		int n=sc.nextInt();
		int [] array=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("The given array is:");
		for(int num:array) {
			System.out.println(num+"\t");
		}
		//largest
		int largest=array[0];
		for(int i=0;i<n;i++) {
			if(array[i]>largest) {
				largest=array[i];
			}
		}
		System.out.println("The largest element is:"+largest);
	}
}
