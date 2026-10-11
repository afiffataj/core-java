class FridgeShopping {
	public static void main(String[] args) {

		System.out.println("the price of fridge");
		int price = FridgeShopping.fridgePrice();
		System.out.println(price);

		System.out.println("the brand of fridge");
		System.out.println(FridgeShopping.fridgeBrand());

		System.out.println("the capacity of fridge");
		short capacity = FridgeShopping.fridgeCapacity();
		System.out.println(capacity);

		System.out.println("the weight of fridge");
		double weight = FridgeShopping.fridgeWeight();
		System.out.println(weight);

		System.out.println("the quantity of fridge");
		byte quantity = FridgeShopping.fridgeQuantity();
		System.out.println(quantity);

		System.out.println("is fridge available");
		boolean available = FridgeShopping.fridgeAvailable();
		System.out.println(available);
	}

	static int fridgePrice() {
		int price = 38000;
		return price;
	}

	static String fridgeBrand() {
		String brand = "LG";
		return brand;
	}

	static short fridgeCapacity() {
		short capacity = 260;
		return capacity;
	}

	static double fridgeWeight() {
		double weight = 58.5d;
		return weight;
	}

	static byte fridgeQuantity() {
		byte quantity = 2;
		return quantity;
	}

	static boolean fridgeAvailable() {
		boolean available = true;
		return available;
	}
}