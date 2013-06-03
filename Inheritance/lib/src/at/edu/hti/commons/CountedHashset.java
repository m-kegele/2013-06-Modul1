package at.edu.hti.commons;

import java.util.Collection;
import java.util.HashSet;

/**
 * in Anlehung an Effective Java
 */
public class CountedHashset<E> extends HashSet<E> {

	private static final long serialVersionUID = 1L;
	private int addCount = 0;
	private int deleteCount = 0;

	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}

	@Override
	public boolean remove(Object o) {
		deleteCount++;
		return super.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		deleteCount -= c.size();
		return super.removeAll(c);
	}

	public int getAddCount() {
		return addCount;
	}

	public int getDeleteCount() {
		return deleteCount;
	}
}
