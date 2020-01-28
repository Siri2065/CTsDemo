package Collections;

import java.util.ArrayList;

public class Get {
	public static void main(String[] args)
	{
		ArrayList<String> l=new ArrayList<>();
		l.add("Selenium");
		l.add("Testing");
		l.add("Project");
	
		
		String l1=l.get(0);
		String l2=l.get(1);
		String l3=l.get(2);
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
	}

}
