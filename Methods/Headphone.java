class Headphone{
	public static void main(String[] args) {

		System.out.println("the price of headphone");
		int price = Headphone.headphonePrice();
		System.out.println(price);

		System.out.println("the brand of headphone");
		System.out.println(Headphone.headphoneBrand());

		System.out.println("the quantity of headphone");
		byte quantity = Headphone.headphoneQuantity();
		System.out.println(quantity);

		System.out.println("the weight of headphone");
		float weight = Headphone.headphoneWeight();
		System.out.println(weight);

		System.out.println("the battery backup");
		short battery = Headphone.headphoneBattery();
		System.out.println(battery);

		System.out.println("is headphone available");
		boolean available = Headphone.headphoneAvailable();
		System.out.println(available);
	}

	static int headphonePrice() {
		int price = 2499;
		return price;
	}

	static String headphoneBrand() {
		String brand = "Boat";
		return brand;
	}

	static byte headphoneQuantity() {
		byte quantity = 4;
		return quantity;
	}

	static float headphoneWeight() {
		float weight = 250.5f;
		return weight;
	}

	static short headphoneBattery() {
		short battery = 40;
		return battery;
	}

	static boolean headphoneAvailable() {
		boolean available = true;
		return available;
	}
}