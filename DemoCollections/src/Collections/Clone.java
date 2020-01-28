package Collections;

import java.util.ArrayList;

public class Clone {
	public static void main(String[] args)
	{
		ArrayList<String> s=new ArrayList<>();
		s.add("Assf");
		s.add("dsgtrtyt");
		s.add("gdrturtjk");
		
		System.out.println(s);
		
		
		 ArrayList<String> sClone =  (ArrayList<String>)s.clone();
         
	        System.out.println(s);   
	}

}
