package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class HasNext {
	public static void main(String[] args)
	{
		ArrayList<String> l=new ArrayList<>();
		l.add("Selenium");
		l.add("Testing");
		l.add("Project");
		

Iterator<String> i = l.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
	}

}
