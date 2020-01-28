package Collections;

import java.util.ArrayList;

public class Indexof {
	public static void main(String[] args)
	{
		ArrayList<String> s=new ArrayList<>();
		s.add("Selenium");
		s.add("Testing");
		s.add("Project");
		
		int i=s.indexOf("Selenium");
		System.out.println(i);
		
		i=s.indexOf("Hiiii");
		System.out.println(i);
		
		
    }
	

}
