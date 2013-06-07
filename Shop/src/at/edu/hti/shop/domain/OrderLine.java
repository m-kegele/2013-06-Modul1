package at.edu.hti.shop.domain;

public class OrderLine {
	private Product product;
	private Integer amount;

	public OrderLine(Product product, Integer amount) {
		super();
		this.product = product;
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Product getProduct() {
		return product;
	}

	public Double calcPrize() {
		return amount * product.getPrize();
	}

	@Override
	public String toString() {
		return "OrderLine [" + product + ", " + amount + "]";
	}

}
