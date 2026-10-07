class MobileShopping {
	public static void main(String[] args) {

		System.out.println("the price of mobile");
		int price = MobileShopping.mobilePrice();
		System.out.println(price);

		System.out.println("the brand of mobile");
		System.out.println(MobileShopping.mobileBrand());

		System.out.println("the quantity of mobile");
		byte quantity = MobileShopping.mobileQuantity();
		System.out.println(quantity);

		System.out.println("the screen size of mobile");
		double screenSize = MobileShopping.mobileScreenSize();
		System.out.println(screenSize);

		System.out.println("is mobile available");
		boolean available = MobileShopping.mobileAvailable();
		System.out.println(available);

		System.out.println("the color of mobile");
		char color = MobileShopping.mobileColor();
		System.out.println(color);
	}

	static int mobilePrice() {
		int price = 25000;
		return price;
	}

	static String mobileBrand() {
		String brand = "Samsung";
		return brand;
	}

	static byte mobileQuantity() {
		byte quantity = 2;
		return quantity;
	}

	static double mobileScreenSize() {
		double size = 6.5d;
		return size;
	}

	static boolean mobileAvailable() {
		boolean available = true;
		return available;
	}

	static char mobileColor() {
		char color = 'B';
		return color;
	}
}