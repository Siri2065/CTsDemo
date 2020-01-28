package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Iteration {
	public static void main(String[] args)
	{
		ArrayList<String> n = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));
		ListIterator<String> i=n.listIterator();
		System.out.println("===========Forward=========");
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("===========Backward=========");
        
        while(i.hasPrevious())
        {
            System.out.println(i.previous());
        }
		
		
	}

}
