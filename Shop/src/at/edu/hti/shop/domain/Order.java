package at.edu.hti.shop.domain;

import java.util.ArrayList;

public class Order extends ArrayList<OrderLine> {

	private static final long serialVersionUID = 1L;

	@Override
	public boolean add(OrderLine e) {

		if (e == null)
			return false;

		return super.add(e);
	}

	public double calcPrize() {
		double sum = 0;

		for (OrderLine line : this) {
			sum += line.getProduct().getPrize()* line.getAmount() ;
		}
		
		if(sum > 10)
		{
			return sum;
		}
		else
		{
			sum = sum + 5;
		}
		
		return sum;
	}

	@Override
	public String toString() {
	
		return super.toString() + " \n =>" +calcPrize();
	}
}
