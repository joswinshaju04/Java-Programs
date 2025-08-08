/* 
 * Title: Inheritance demo 
 * Author : Joswin Shaju
 * Date : 08/08/2025
 */


package prgs;

class Book{
	String title;
	String author;
	double price;
	
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void DisplayDetail() {
		System.out.println("Title:"+title);
		System.out.println("Auhtor:"+author);
		System.out.println("Price:"+price);
	}
}
 class EBook extends Book{
	 double fileSize;
	 EBook(String title,String author,double price,double fileSize){
		 super(title,author,price);
		 this.fileSize=fileSize;
		 
	 }
	 public void DisplayDetail() {
			super.DisplayDetail();
			System.out.println("File Size:"+fileSize);
		}
 }
class PrintedBook extends Book{
	int noOfPages;
	PrintedBook(String title,String author,double price,int noOfPages){
		super(title,author,price);
		this.noOfPages=noOfPages;
	}
	public void DisplayDetail() {
		super.DisplayDetail();
		System.out.println("Number Of Pages:"+noOfPages);
	}
}
public class InheritanceExp {
	public static void main(String [] args) {
		EBook ebook=new EBook("Fly High","Bin Laden",56.25,45.11);
		ebook.DisplayDetail();
		System.out.println();
		PrintedBook printedbook=new PrintedBook("How To Fly","Obama",599.99,999);
		printedbook.DisplayDetail();
	}
}
