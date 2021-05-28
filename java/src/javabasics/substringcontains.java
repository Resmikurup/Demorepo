package javabasics;

import java.util.Scanner;

public class substringcontains {
	static boolean subcontains(String st1,String st2) {
		boolean result;
		result=st1.contains(st2);
		return result;
		
		
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first string");
		String st1=in.nextLine();
		System.out.println("Enter second string");
		String st2=in.nextLine();
		boolean ser=substringcontains.subcontains(st1,st2);
		System.out.println(ser);

	}

}
