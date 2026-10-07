class Watch{
	public static void main(String[] args) {

		System.out.println("the price of watch");
		int price = Watch.watchPrice();
		System.out.println(price);

		System.out.println("the brand of watch");
		System.out.println(Watch.watchBrand());

		System.out.println("the quantity of watch");
		byte quantity = Watch.watchQuantity();
		System.out.println(quantity);

		System.out.println("the weight of watch");
		double weight = Watch.watchWeight();
		System.out.println(weight);

		System.out.println("the model code");
		char model = Watch.watchModel();
		System.out.println(model);

		System.out.println("is watch available");
		boolean available = Watch.watchAvailable();
		System.out.println(available);
	}

	static int watchPrice() {
		int price = 4500;
		return price;
	}

	static String watchBrand() {
		String brand = "Titan";
		return brand;
	}

	static byte watchQuantity() {
		byte quantity = 2;
		return quantity;
	}

	static double watchWeight() {
		double weight = 52.5d;
		return weight;
	}

	static char watchModel() {
		char model = 'T';
		return model;
	}

	static boolean watchAvailable() {
		boolean available = true;
		return available;
	}
}