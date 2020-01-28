package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RetainAll {
	 public static void main(String[] args) //throws CloneNotSupportedException 
	    {
	        ArrayList<String> num = new ArrayList<>(Arrays.asList("1", "28", "3", "4", "5","1","1","28"));
	         
	        System.out.println(num);
	         
	        num.retainAll(Collections.singleton("28"));
	         
	        System.out.println(num);
	    }

}
