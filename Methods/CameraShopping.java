class CameraShopping {
	public static void main(String[] args) {

		System.out.println("the price of camera");
		long price = CameraShopping.cameraPrice();
		System.out.println(price);

		System.out.println("the brand of camera");
		System.out.println(CameraShopping.cameraBrand());

		System.out.println("the quantity of camera");
		byte quantity = CameraShopping.cameraQuantity();
		System.out.println(quantity);

		System.out.println("the weight of camera");
		double weight = CameraShopping.cameraWeight();
		System.out.println(weight);

		System.out.println("the megapixel of camera");
		float megapixel = CameraShopping.cameraMegapixel();
		System.out.println(megapixel);

		System.out.println("is camera available");
		boolean available = CameraShopping.cameraAvailable();
		System.out.println(available);

		System.out.println("the camera color code");
		char color = CameraShopping.cameraColor();
		System.out.println(color);
	}

	static long cameraPrice() {
		long price = 125000L;
		return price;
	}

	static String cameraBrand() {
		String brand = "Canon";
		return brand;
	}

	static byte cameraQuantity() {
		byte quantity = 2;
		return quantity;
	}

	static double cameraWeight() {
		double weight = 1.25d;
		return weight;
	}

	static float cameraMegapixel() {
		float megapixel = 24.5f;
		return megapixel;
	}

	static boolean cameraAvailable() {
		boolean available = true;
		return available;
	}

	static char cameraColor() {
		char color = 'B';
		return color;
	}
}