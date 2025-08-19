/* 
 * Title: Print a 2-D matrix and its transpose.
 * Author : Joswin Shaju
 * Date : 19/08/2025
 */


package array;

import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Row:");
		int r=sc.nextInt();
		System.out.println("Enter the value of Column:");
		int c=sc.nextInt();
		
		int [][] matrix=new int[r][c];
		int [][] transpose=new int[r][c];
		System.out.println("Enter the elements in the array:");
		//Input elements
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		//Print Matrix
		System.out.println("Original matrix:");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		//transposing
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				transpose[j][i]=matrix[i][j];
			}
			
		}
		//tansposed matrix
		System.out.println("Transposed Matrix:");
		for(int j=0;j<transpose.length;j++) {
			for(int i=0;i<transpose[j].length;i++) {
				System.out.print(transpose[j][i]+"\t");
			}
			System.out.println();
		}
		
		
	}
}
