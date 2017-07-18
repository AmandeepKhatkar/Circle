
public class Author
{
	String authorName;
	String email;
	char gender;
	public String getAuthorName() {
		return authorName;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
Author()//default constructor
{
	
}
Author(String name,String email,char gender)//constructor with arguments
{
	this.authorName = name;
	this.email = email;
	this.gender = gender;
}
public String toString()
{
	String info= "Author name = "+this.authorName+"  ,Email = "+this.email+"  ,gender = "+this.gender;
	return info;
}

}
