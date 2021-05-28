package javabasics;

public class demo implements I,S
{
	public void show() {
		System.out.println("test");
	}
	public  void trim() {
		System.out.println("rtl");
	}

	public static void main(String[] args) {
		demo c= new demo();
		c.show();
		c.trim();

	}

}
