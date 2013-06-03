package at.edu.hti.generics;

public class Name implements Comparable<String> {

	private String name;

	public Name(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(String o) {

		return name.compareTo(o);
	}

}
