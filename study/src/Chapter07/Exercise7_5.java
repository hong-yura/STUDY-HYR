package Chapter07;

class Product {
	
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수
	
	Product() {}
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}

class Tv extends Product {
	// 에러 이유 : Product 클래스에 기본 생성자 Product() 가 없기 때문에 에러가 발생한다.
	// Product 클래스에 기본 생성자 Product() {} 를 추가해 줘야한다.

	Tv() {}
	
	public String toString() {
		return "Tv";
	}
	
}


public class Exercise7_5 {
	public static void main(String[] args) {
		Tv t = new Tv();
	}
}
