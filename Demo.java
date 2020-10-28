import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(100);
		values.add(200);
		values.add(300);
		
		for(int i=0 ; i<values.size() ; i++)
		{
			System.out.println(values.get(i));
		}
		
		Iterator itr = values.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		for (int i : values)
		 System.out.println(i);

		values.forEach(i -> System.out.println("For Each" + " " + i));//Internal Iteration
	}

}
