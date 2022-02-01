package MyFirstVariableNaming;

import java.util.Scanner;

import java.util.Calendar;

public class UserProfile {
	  public static void main(String[] args) {
		   Scanner scann = new Scanner(System.in);
		   System.out.println("Please enter your name ");
		   String name = scann.nextLine();
		   
		   System.out.println("Please enter your age ");
		   String age = scann.nextLine();     
		   int ageN = Integer.parseInt(age);
		   
		   System.out.println("Please enter your gender ");
		   String gender = scann.nextLine();
		   
		   System.out.println("Please enter your job preference ");
		   String job = scann.nextLine();
		   
		   System.out.println("Please enter your nationality ");
		   String nat = scann.nextLine();
		   
		   System.out.println("Please enter your blood type ");
		   String blood = scann.nextLine();

		   System.out.println("Your name is "+ name + ", you are " + age + " years old" + ", your gender is " + gender + ", your job preference is " + job + ", you are " + nat + " and your blood type is " + blood);


		   Calendar date = Calendar.getInstance();
		    int year = date.get(Calendar.YEAR);
	        
	        int date1 = (year - ageN);
	        
	        System.out.println("You Born in: "+ date1);
		   
}
}
