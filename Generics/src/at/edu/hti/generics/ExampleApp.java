package at.edu.hti.generics;

import java.util.ArrayList;
import java.util.List;

public class ExampleApp {

	// siehe http://www.torsten-horn.de/techdocs/java-generics.htm

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Number[] a = new Integer[1];
		a[0] = new Double(3.14);

		// ArrayList<Number> a = new ArrayList<Integer>();

		Comparable<String> t1 = "Test";
		String s1 ="Test1";
		Comparable<String> t2 = s1;

		t1.compareTo(s1);
		
		List<? super Comparable<String>> sort = new ArrayList<>();
		sort.add(s1);
		sort.add(new Name("Hansi"));
		sort.add("1");
		
//		Collections.sort(sort); //Fehler
		
		
	}

}
