package at.edu.hti.shop.domain;

public class Product {
	private String name;
	private Long id;
	private Double prize;

	public Product(Long id, String name, Double prize) {
		super();
		this.name = name;
		this.id = id;
		this.prize = prize;
	}

	public String getName() {
		return name;
	}

	public long getId() {
		return id;
	}

	public Double getPrize() {
		return prize;
	}

	@Override
	public String toString() {
		return "Product [" + name + ", " + id + ", " + prize + "]";
	}

}
