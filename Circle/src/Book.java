
public class Book extends Author
{
String bookname;
double price;
int qty=0;

public String getBookName() {
	return bookname;
}


public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
Book()
{
	super();//first create base class constructor
}
public Book(String bookname,String Authorname,String email,char gender,double price,int qty)
{
	super(Authorname,email,gender);//call to base class constructor (of parameters)
	this.bookname = bookname;
	this.price = price;
	this.qty = qty;
	
}
public String toString()//method Overriding
{
	String info="Author name = "+this.authorName+",  Book name "+bookname+", Email = "+this.email+", gender = "+this.gender+",  Price = "+this.price+",  quantity is = "+this.qty;
	return info;
}
}
