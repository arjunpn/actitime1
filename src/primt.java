import java.util.ArrayList;
import java.util.List;


public class primt {
	public static void main(String[] args) {
		
		
		 ArrayList<String> obj = new ArrayList<String>();
			obj.add("tom");
			obj.add("tom1");
			obj.add("tom2");
			obj.add("tom3");
			obj.add("tom31");
			obj.add("tom4");
			obj.add("tim1");
			
			System.out.println(obj.size());
			String z=obj.get(6);
			System.out.println(z);
			System.out.println(obj);
			int x=obj.indexOf("tom4");
			System.out.println(x);
			obj.remove(4);
			System.out.println(obj);
			obj.set(1, "arjun");
			System.out.println(obj);
			obj.remove("tom2");
			System.out.println(obj);
			obj.add(2, "sindhura");
			System.out.println(obj);
			ArrayList<String> l1= new ArrayList<String>();
			l1.addAll(obj);
			System.out.println(l1);
			l1.addAll( obj);
			System.out.println(l1);
			List<Object> listAnything = new ArrayList<Object>();
			listAnything.add("safads");
			listAnything.add(5);
			System.out.println(listAnything);
			
			
		}
	}

		
	

