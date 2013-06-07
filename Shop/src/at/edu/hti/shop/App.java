package at.edu.hti.shop;

import at.edu.hti.shop.domain.AdditionalShippingCostsStrategy;
import at.edu.hti.shop.domain.IPriceStrategy;
import at.edu.hti.shop.domain.Order;
import at.edu.hti.shop.domain.OrderLine;
import at.edu.hti.shop.domain.Product;

public class App {
	public static void main(String[] args) {

		Order shopOrder = new Order();

		OrderLine line1 = new OrderLine(new Product(1L, "Äpfel", 1.2), 4);
		OrderLine line2 = new OrderLine(new Product(2L, "Birnen", 1.5), 2);

		OrderLine line3 = new OrderLine(new Product(3L, "Pfirsich", 2.2), 5);
		OrderLine line4 = new OrderLine(new Product(4L, "Kiwi", 3.5), 6);

		shopOrder.add(line1);
		shopOrder.add(line2);
		System.out.println(shopOrder.size());
		System.out.println(shopOrder);

		shopOrder.get(0).setAmount(8);

		System.out.println(shopOrder.size());
		System.out.println(shopOrder);

		shopOrder.get(1).setAmount(0);

		System.out.println(shopOrder.size());
		System.out.println(shopOrder);

		shopOrder.add(line3);
		shopOrder.add(line4);
		
		IPriceStrategy s = new AdditionalShippingCostsStrategy();
		s.calcPrice(shopOrder.getOrderLines());

	}
}
