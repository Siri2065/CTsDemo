package Collections;

import java.util.ArrayList;

public class Contains {
	public static void main(String[] args)
	{
		ArrayList<String> s=new ArrayList<>(2);
		s.add("A");
		s.add("AB");
		s.add("ABC");
		s.add("ABCD");
		
		System.out.println(s.contains("ABC"));
		System.out.println(s.contains("sghag"));
	}

}
