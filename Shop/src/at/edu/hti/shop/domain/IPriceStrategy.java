package at.edu.hti.shop.domain;

import java.util.List;

public interface IPriceStrategy {

	Double calcPrice(List<OrderLine> lines);
	
}
