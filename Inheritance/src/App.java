import java.util.Arrays;

import at.edu.hti.commons.CountedHashset;

public class App {
	public static void main(String[] args) {

		CountedHashset<String> test = new CountedHashset<String>();

		test.addAll(Arrays.asList("Mimmi", "spielt", "Ball"));
		
		while(test.iterator().hasNext())
		{
			test.remove(test.iterator().next());
		
		}
		
		System.out.println(test.getAddCount()+" "+test.getDeleteCount());
	
	
	}
}
