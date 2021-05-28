package javabasics;

import java.util.ArrayList;
import java.util.Collections;

public class allist {

	public static void main(String[] args) {

ArrayList<String>al=new ArrayList<String>();
           al.add("java");
           al.add("test");
           al.add("any");
           for(String sh:al) {
        	   System.out.println(sh);
           }
           Collections.sort(al);
           for(String sh:al) {
        	   System.out.println(sh);
           }
           System.out.println("#####after removing#####3");
           al.remove(0);
           for(String sh:al) {
        	   System.out.println(sh);
           }
	}
}


