package my.tric;

import java.util.Scanner;

public class Listing {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name then age");
		 String[] input = new String[2];
		for (int i = 0; i < input.length; i++) {
		      String userInput = scanner.next();
		      input[i] = userInput;
		    }

		System.out.print("The name is: ");
		Listing myListing = new Listing();
	    myListing.setName(input[0]);
	    System.out.println(myListing.getName());
	    
	    System.out.print("The age is: ");
		
	    myListing.setAge(input[1]);
	    System.out.println(myListing.getAge());
	}
	   private String name = " ";
	   private String age;
	   
	   public String getName() {
	     return name;
	   }
	  
	   public void setName(String newName) {
	     this.name = newName;
	   }
	    
	   public String getAge() {
	     return age;
	   }
	   
	   public void setAge(String newAge) {
	     this.age = newAge;
	   }
}