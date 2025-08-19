/* 
 * Title: Print a 2-D matrix
 * Author : Joswin Shaju
 * Date : 19/08/2025
 */


package array;

import java.util.Scanner;

public class Matrix {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Row:");
		int r=sc.nextInt();
		System.out.println("Enter the value of Column:");
		int c=sc.nextInt();
		
		int [][] matrix1=new int[r][c];
		System.out.println("Enter the elements in the array:");
		//Input elements
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				matrix1[i][j]=sc.nextInt();
			}
		}
		//Print Matrix
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<matrix1[i].length;j++) {
				System.out.print(matrix1[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
