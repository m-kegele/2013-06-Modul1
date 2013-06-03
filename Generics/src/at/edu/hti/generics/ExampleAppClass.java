package at.edu.hti.generics;

import at.edu.hti.generics.util.GenericClass;
import at.edu.hti.generics.util.StringClass;

public class ExampleAppClass {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		GenericClass<Integer> integerClass = new GenericClass<>();
		// integerClass.info(typ)

		StringClass stringClass = new StringClass();
		GenericClass<String> testInstance = stringClass;
		
		stringClass.staticTest(new Integer(42)); //??
		
		
	}
}
