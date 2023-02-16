package test;

public class 커피트럭사용 {

	public static void main(String[] args) {
		CoffeeTruck co = new CoffeeTruck();
		co.color = "핑크색";
		co.price = 4000;
		co.weight = 1;
	
		co.move();
		co.sell();
	}

}