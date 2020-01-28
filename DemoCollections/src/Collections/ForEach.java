package Collections;

import java.util.ArrayList;
import java.util.Arrays;

//import java.util.ArrayLlist;
public class ForEach {
	public static void main(String[] args)
	{
	ArrayList<String> List= new ArrayList<String>(Arrays.asList( "abcd", "bcdef", "cdefgh") );
    
	for(String name : List)
	{
	    System.out.println(name);
	}

}
}