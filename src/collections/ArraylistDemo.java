package collections;

import java.util.ArrayList;


public class ArraylistDemo {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add("jsp");
	
	ArrayList a1=new ArrayList();
	
	
	a1.add(500);
	a1.add(600);
	a1.add(700);
	a1.add("QSP");
	
	System.out.println(a1);
	
	System.out.println("After adding a1 object");
	al.addAll(a1);
	
	System.out.println(al);
	a1.addAll(a1);
	System.out.println(a1);
	al.removeAll(a1);
	System.out.println(al);
	al.remove(2);
	System.out.println(al);
	System.out.println(al.contains(2210));
	
	
	
	
	
	
	
	}

}
