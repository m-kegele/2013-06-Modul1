package at.edu.hti.shop.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable {

	private final ArrayList<OrderLine> lines;
	private static final long serialVersionUID = 1L;
	private IPriceStrategy strategy = new FreeShippingStrategy();

	public Order() {
		this.lines = new ArrayList<OrderLine>();
	}

	public boolean add(OrderLine e) {
		if (e == null || e.getAmount() == 0)
			return false;

		return lines.add(e);
	}

	public double calcPrize() {
		return strategy.calcPrice(lines);
	}

	@Override
	public String toString() {
		return super.toString() + " \n =>" + calcPrize();
	}

	public OrderLine get(Integer i) {
		if ((i <= lines.size() - 1)) {
			return lines.get(i);
		}
		return null;
	}

	public Integer size() {
		return lines.size();
	}
	
	public List<OrderLine> getOrderLines(){
		return lines;
	}
}
