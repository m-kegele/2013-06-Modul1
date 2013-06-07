package at.edu.hti.shop.domain;

import java.util.ArrayList;
import java.util.List;

public class AdditionalShippingCostsStrategy implements IPriceStrategy {
	
	public Double calcPrice(List<OrderLine> lines) {
		Double sum = 0.;
		List<OrderLine> linesToRemove = new ArrayList<OrderLine>();
		
		for (OrderLine line : lines) {
			if (line.getAmount() == 0) {
				linesToRemove.add(line);
			} else {
				sum += line.calcPrize();
			}
		}

		lines.removeAll(linesToRemove);
		
		if (sum <= 10){
			sum = sum + 5;
		}

		return sum;
	}
}
