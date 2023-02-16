package test;

public class Mask {
	
	String color;
	int price;
	int count;
	
	static int total;
	
	public Mask(String color, int price, int count) {
		this.color = color;
		this.price = price;
		this.count = count;
		total++;
	}

	@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", count=" + count + "]";
	}
}



