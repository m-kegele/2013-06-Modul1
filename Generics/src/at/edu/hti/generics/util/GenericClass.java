package at.edu.hti.generics.util;

public class GenericClass<T> {

	// public T create()
	// {
	// return new T();
	// }

	public String info(T typ) {
		return typ.getClass().getName();
	}

	// public String info()
	// {
	// return T.getClass().getName();
	// }

	// public static T test()
	// {
	//
	// }
	
	
	public static <T> void staticTest (T t)  //gilt nur für die statische Methode
	{
		System.out.println(t);
	}
}
