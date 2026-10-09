class Restaurant {
	public static void main(String[] args) {

		System.out.println("Is restaurant open");
		Restaurant.isRestaurantOpen();
		Restaurant.isRestaurantOpen();
		Restaurant.isRestaurantOpen();

		System.out.println("Is takeaway available");
		Restaurant.isTakeawayAvailable();
		Restaurant.isTakeawayAvailable();
		Restaurant.isTakeawayAvailable();

		System.out.println("Are vegetarian dishes available");
		Restaurant.areVegetarianDishesAvailable();
		Restaurant.areVegetarianDishesAvailable();
		Restaurant.areVegetarianDishesAvailable();

		System.out.println("Is online payment accepted");
		Restaurant.isOnlinePaymentAccepted();
		Restaurant.isOnlinePaymentAccepted();
		Restaurant.isOnlinePaymentAccepted();

		System.out.println("Restaurant name");
		System.out.println(Restaurant.getRestaurantName());
		System.out.println(Restaurant.getRestaurantName());
		System.out.println(Restaurant.getRestaurantName());

		System.out.println("Price of meals");
		System.out.println(Restaurant.getMealPrice());
		System.out.println(Restaurant.getMealPrice());
		System.out.println(Restaurant.getMealPrice());

		System.out.println("Number of tables");
		System.out.println(Restaurant.getNumberOfTables());
		System.out.println(Restaurant.getNumberOfTables());
		System.out.println(Restaurant.getNumberOfTables());

		System.out.println("Restaurant location");
		System.out.println(Restaurant.getRestaurantLocation());
		System.out.println(Restaurant.getRestaurantLocation());
		System.out.println(Restaurant.getRestaurantLocation());
	}

	static void isRestaurantOpen() {
		System.out.println("Yes, the restaurant is open");
	}

	static void isTakeawayAvailable() {
		System.out.println("Yes, takeaway is available");
	}

	static void areVegetarianDishesAvailable() {
		System.out.println("Yes, vegetarian dishes are available");
	}

	static void isOnlinePaymentAccepted() {
		System.out.println("Yes, online payment is accepted");
	}

	static String getRestaurantName() {
		return "Spice Garden";
	}

	static int getMealPrice() {
		return 120;
	}

	static int getNumberOfTables() {
		return 15;
	}

	static String getRestaurantLocation() {
		return "Rajajinagar";
	}
}