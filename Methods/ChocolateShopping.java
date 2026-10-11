class ChocolateShopping {
	public static void main(String[] args) {

		System.out.println("the price of chocolate");
		int price = ChocolateShopping.chocolatePrice();
		System.out.println(price);

		System.out.println("the brand of chocolate");
		System.out.println(ChocolateShopping.chocolateBrand());

		System.out.println("the quantity of chocolate");
		byte quantity = ChocolateShopping.chocolateQuantity();
		System.out.println(quantity);

		System.out.println("the weight of chocolate");
		double weight = ChocolateShopping.chocolateWeight();
		System.out.println(weight);

		System.out.println("the rating of chocolate");
		float rating = ChocolateShopping.chocolateRating();
		System.out.println(rating);

		System.out.println("is chocolate available");
		boolean available = ChocolateShopping.chocolateAvailable();
		System.out.println(available);
	}

	static int chocolatePrice() {
		int price = 650;
		return price;
	}

	static String chocolateBrand() {
		String brand = "Dairy Milk";
		return brand;
	}

	static byte chocolateQuantity() {
		byte quantity = 6;
		return quantity;
	}

	static double chocolateWeight() {
		double weight = 120.5d;
		return weight;
	}

	static float chocolateRating() {
		float rating = 4.8f;
		return rating;
	}

	static boolean chocolateAvailable() {
		boolean available = true;
		return available;
	}
}