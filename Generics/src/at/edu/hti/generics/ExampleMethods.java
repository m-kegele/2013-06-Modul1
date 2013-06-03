package at.edu.hti.generics;

import java.math.BigDecimal;

public class ExampleMethods {

	// siehe http://www.torsten-horn.de/techdocs/java-generics.htm

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Integer ii = onlyPositiv(new Integer(42));
		BigDecimal bd = onlyPositiv(new BigDecimal(4711));

		String s = "Bla";
		StringBuffer sb = new StringBuffer("Blubb");

		System.out.println(laengererText(s, sb));

	}

	static <T extends Number> T onlyPositiv(T parm) {
		return (parm.doubleValue() >= 0) ? parm : null;
	}

	static <T extends CharSequence> T laengererText(T parm1, T parm2) {
		return (parm1.length() > parm2.length()) ? parm1 : parm2;
	}
}
