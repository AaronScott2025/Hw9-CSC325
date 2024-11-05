/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;
import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
	 	Scanner s = new Scanner(System.in);

		Student std1= new Student("James", (short) 20, 90); // name, age, credits | General Student
		Student std= new Freshman("James", (short) 20, 12); // name, age, credits | Freshman Student
	    Student std2 = new Senior("John", (short) 30, 88); // name, age, credits  | Senior Student
//	 	Student std3Error = new Senior("Errorboy", (short) 30, 23); TESTING STATEMENT FOR ERROR THROWN WITH TOO FEW CREDITS

		System.out.println(std1);
		System.out.println(std);
		System.out.println(std2);
//		System.out.println(std3Error);

	 	Student newStudent;
	 	System.out.println("Enter your name: ");
	 	String Name = s.next(); //Next input for Name
	 	System.out.println("Enter your age: ");
		short age = s.nextShort(); //Next input for age
	 	System.out.println("Enter your credit count: ");
		int credits = s.nextInt(); //Next input for credits
	 	System.out.println("Enter your academic standing: ");
		String standing = s.next(); //Next input for academic standing
		if(standing.equals("Freshman")){ //If standing is Freshman
			newStudent = new Freshman(Name, age, credits);
		} else if (standing.equals("Senior")){ //If standing is Senior
			newStudent = new Senior(Name, age, credits); //No exception here, since its handled in the class itself
		} else { //Otherwise assumes the generic
			newStudent = new Student(Name, age, credits);
		}
		System.out.println(newStudent);

		// ToDo 13: add comments and explain your code

	}

}

