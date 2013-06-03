package at.edu.hti.generics;

import java.util.ArrayList;
import java.util.List;

public class ExampleWildcards {

	// siehe http://www.torsten-horn.de/techdocs/java-generics.htm

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// List<Object> objectListe = new ArrayList<Integer>();

		List<Object> objectListe = new ArrayList<Object>();
		objectListe.add(new Integer(42));

		List<?> wildcardListe = new ArrayList<Integer>();
		// wildcardListe.add( new Integer(42) );

		List<? extends Number> extNumberListe = new ArrayList<Integer>();
		// extNumberListe.add(new Integer(42))

		List<Number> numberListe = new ArrayList<Number>();
		numberListe.add(new Integer(42));
	}
}
