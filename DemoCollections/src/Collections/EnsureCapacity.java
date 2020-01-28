package Collections;

import java.util.ArrayList;

public class EnsureCapacity {
	public static void main(String[] args)
	{
		ArrayList<String> i=new ArrayList<>();
		i.add("24");
		i.add("36");
		
		System.out.println(i);
		
		i.ensureCapacity(0);
		i.add("45");
		i.add("76");
		i.add("979");
		
		System.out.println(i);
		
	}

}
