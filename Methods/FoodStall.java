class FoodStall {
	public static void main(String[] args) {

		System.out.println("What type of food is available in the food stall");
		FoodStall.whatTypeOfFoodIsAvailable();
		FoodStall.whatTypeOfFoodIsAvailable();
		FoodStall.whatTypeOfFoodIsAvailable();

		System.out.println("Can we get takeaway food");
		FoodStall.canWeGetTakeawayFood();
		FoodStall.canWeGetTakeawayFood();
		FoodStall.canWeGetTakeawayFood();

		System.out.println("Are cold drinks available");
		FoodStall.areColdDrinksAvailable();
		FoodStall.areColdDrinksAvailable();
		FoodStall.areColdDrinksAvailable();

		System.out.println("Does the food stall accept online payments");
		FoodStall.doesFoodStallAcceptOnlinePayments();
		FoodStall.doesFoodStallAcceptOnlinePayments();
		FoodStall.doesFoodStallAcceptOnlinePayments();

		System.out.println("What is the name of the food stall");
		System.out.println(FoodStall.theNameOfFoodStall());
		System.out.println(FoodStall.theNameOfFoodStall());
		System.out.println(FoodStall.theNameOfFoodStall());

		System.out.println("What is the price of a plate of dosa");
		System.out.println(FoodStall.thePriceOfDosa());
		System.out.println(FoodStall.thePriceOfDosa());
		System.out.println(FoodStall.thePriceOfDosa());

		System.out.println("How many tables are available");
		System.out.println(FoodStall.theNumberOfTables());
		System.out.println(FoodStall.theNumberOfTables());
		System.out.println(FoodStall.theNumberOfTables());

		System.out.println("What is the location of the food stall");
		System.out.println(FoodStall.theLocationOfFoodStall());
		System.out.println(FoodStall.theLocationOfFoodStall());
		System.out.println(FoodStall.theLocationOfFoodStall());

	}

	static void whatTypeOfFoodIsAvailable() {
		System.out.println("South Indian snacks, dosa, idli and vada are available");
	}

	static void canWeGetTakeawayFood() {
		System.out.println("Yes, customers can order takeaway food");
	}

	static void areColdDrinksAvailable() {
		System.out.println("Yes, cold drinks and bottled water are available");
	}

	static void doesFoodStallAcceptOnlinePayments() {
		System.out.println("Yes, customers can pay using UPI");
	}

	static String theNameOfFoodStall() {
		String stallName = "Tasty Bites";
		return stallName;
	}

	static int thePriceOfDosa() {
		int price = 40;
		return price;
	}

	static int theNumberOfTables() {
		int tables = 8;
		return tables;
	}

	static String theLocationOfFoodStall() {
		String location = "Rajajinagar, Bengaluru";
		return location;
	}
}
