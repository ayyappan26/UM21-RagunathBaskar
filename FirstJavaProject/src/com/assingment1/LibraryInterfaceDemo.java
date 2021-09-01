package com.assingment1;
interface LibraryUser{
	public void registerAccount(int age);
	public void requestBook(String bookType);
}
class KidUsers implements LibraryUser{
	public void registerAccount(int age){
		if(age<12){
			System.out.println("You have successfully registered under a Kids Account");
		}
		else{
			System.out.println("Sorry,Age must be less than 12 to register as a kid");
		}
	}
	public void requestBook(String bookType){
		if(bookType=="Kids"){
			System.out.println("Book Issued Successfully,please return the book within 10 days");
		}
		else{
			System.out.println("Oops,you are allowed to take only kids books");
		}
	}	
}
class AdultUser implements LibraryUser{
	public void registerAccount(int age){
		if(age>12){
			System.out.println("You have successfully registered under a Adult Account");
		}
		else{
			System.out.println("Sorry,Age must be greater than 12 to register as an adult");
		}
	}
	public void requestBook(String bookType){
		if(bookType=="Fiction"){
			System.out.println("Book Issued Successfully,please return the book within 7 days");
		}
		else{
			System.out.println("Oops,you are allowed to take only adult fiction books");
		}
	}
	
}
public class LibraryInterfaceDemo {
	public static void main(String args[]){
		KidUsers mykidUsers=new KidUsers(); 
		mykidUsers.registerAccount(10);
		mykidUsers.registerAccount(18);
		mykidUsers.requestBook("Kids");
		mykidUsers.requestBook("Fiction");
		AdultUser myAdultUser=new AdultUser(); 
		myAdultUser.registerAccount(5);
		myAdultUser.registerAccount(23);
		myAdultUser.requestBook("Kids");
		myAdultUser.requestBook("Fiction");	
	}
}
