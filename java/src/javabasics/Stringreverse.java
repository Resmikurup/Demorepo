package javabasics;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		System.out.println("Enter first string");
		Scanner in=new Scanner(System.in);
		String st1=in.nextLine();
		String st2="";
		int size=st1.length();
		for(int i=size-1;i>=0;i--) 
			st2=st2+st1.charAt(i);
			System.out.println("Reverse string is:"+st2);
			
		
		
	}

}
