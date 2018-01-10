package collections;

import java.util.ArrayList;

public class ArrayList1 {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> al=new ArrayList<Comparable>();
		al.add(10);
		al.add(11);
		al.add("jsp");
		al.add('a');
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(16);
		al.add(17);
		al.add("jsp");
		al.add('a');
		al.add(34.32);
		al.add(32.33);
		al.add(10);
		al.add(11);
		al.add("jsp");
		al.add('a');
		al.add(34.32);
		al.add(12);
		System.out.println(al);
		
		

		
	for (int i = 0; i < al.size(); i++) {
		Object obj=al.get(i);
		if(obj instanceof Integer)
		{
			
		}
		else
		{
			al.remove(obj);
			i=i-1;
		}
			
	}		
	System.out.println(al);
	for (int i = 0; i < al.size(); i++) {
		Object obj1=al.get(i);
		Integer itr=(Integer)obj1;
		if(itr%2 !=0){
			al.set(i, 2);
		}
		
	}
	
	ArrayList<Comparable> al1=new ArrayList<Comparable>();
	al1.add(21);
	al1.add(22);
	al1.add(23);
	al1.add(24);
	
	al.addAll(al1);
		
	System.out.println(al);	
	al.retainAll(al1);
	System.out.println(al);
	}
	
}
