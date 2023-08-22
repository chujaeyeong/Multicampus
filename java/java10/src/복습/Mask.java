package 복습;

public class Mask {
	// 멤버변수 
	String color;
	int price;
	int count;
	
	public Mask(String color, int price, int count) {
		super();
		this.color = color;
		this.price = price;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", count=" + count + "]";
	}
	
	
	
	
	
}
