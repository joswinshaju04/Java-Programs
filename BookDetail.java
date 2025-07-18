/* 
 * Title: Book Detail
 * Author : Joswin Shaju
 * Date : 18/07/2025
 */

package prgms;

class Book{
	String title;
	String author;
	double price;
	Book(){
		title="Unknown";
		author="Not Assigned";
		price=0.0;
	} 
	public void displayDetail() {
		System.out.println("Title:\t" +title);
		System.out.println("Author:\t" +author);
		System.out.println("Price:\t" +price);
	}
}

public class BookDetail {
	public static void main(String [] args) {
		Book books=new Book();
		books.displayDetail();
	}
	
}