package com.generation.java;

import java.util.Scanner;

public class MyFirstInput {
           public static void main(String[] args) {
		   Scanner escaner = new Scanner(System.in);
		   System.out.println("Please enter your name ");
		   String name = escaner.nextLine();

		   System.out.println("My name is "+ name);
		 }
}
