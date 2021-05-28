package javabasics;

public class Substringdemo {

	public static void main(String[] args) {
		System.out.println("Find all substrings");
		String sh="tes";
		System.out.println(sh.length());
		for(int i=0;i<sh.length();i++)
			for(int j=i+1;j<=sh.length();j++)
			{
		System.out.println(sh.substring(i,j));
			}
	}

}
