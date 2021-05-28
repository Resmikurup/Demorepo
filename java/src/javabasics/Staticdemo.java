package javabasics;

public class Staticdemo {
	static void test() {
		System.out.println("test");
	}
static void tesy() {
	System.out.println("testkkjkj");
	test();
}
public static void main(String[]args) {
	Staticdemo.tesy();
}

}

