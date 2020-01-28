package Collections;

import java.util.ArrayList;

public class LastIndex {
	public static void main(String[] args)
	{
		ArrayList<String> s=new ArrayList<>();
		s.add("Selenium");
		s.add("Testing");
		s.add("Project");
		s.add("zgfsdg");
		s.add("Project");
		
		
		int i=s.lastIndexOf("Project");
		System.out.println(i);
		
		i = s.lastIndexOf("hello");
		System.out.println(i);
		
		
	}

}
