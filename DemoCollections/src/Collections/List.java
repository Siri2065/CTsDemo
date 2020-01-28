package Collections;
import java.util.ArrayList;
public class List {
	public static void main(String[] args)
	{
		ArrayList<String> l1=new ArrayList<>();
		
		l1.add("1234");
		l1.add("SELENIUM");
		l1.add("TESTING");
		l1.add("PROJECT");
		
		ArrayList<String> l2=new ArrayList<>();
		l2.add("sgerty");
		l1.addAll(l2);
		
		System.out.println(l1);
		
		
		
		l1.remove("sgerty");
		System.out.println(l1);
		
	}

}
