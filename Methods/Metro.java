class Metro{
	public static void main(String[] args){

		System.out.println("What type of customers can shop at Metro");
		Metro.whatTypeOfCustomersCanShop();
		Metro.whatTypeOfCustomersCanShop();
		Metro.whatTypeOfCustomersCanShop();

		System.out.println("Does Metro provide wholesale products");
		Metro.doesMetroProvideWholesaleProducts();
		Metro.doesMetroProvideWholesaleProducts();
		Metro.doesMetroProvideWholesaleProducts();

		System.out.println("Does Metro sell food products");
		Metro.doesMetroSellFoodProducts();
		Metro.doesMetroSellFoodProducts();
		Metro.doesMetroSellFoodProducts();

		System.out.println("Does Metro provide delivery service");
		Metro.doesMetroProvideDeliveryService();
		Metro.doesMetroProvideDeliveryService();
		Metro.doesMetroProvideDeliveryService();

		System.out.println("In which year did Metro start serving businesses in India");
		System.out.println(Metro.theYearMetroStartedInIndia());
		System.out.println(Metro.theYearMetroStartedInIndia());
		System.out.println(Metro.theYearMetroStartedInIndia());

		System.out.println("How many states does Metro have wholesale outlets in");
		System.out.println(Metro.theNumberOfStatesWithMetroOutlets());
		System.out.println(Metro.theNumberOfStatesWithMetroOutlets());
		System.out.println(Metro.theNumberOfStatesWithMetroOutlets());

		System.out.println("What is the Metro customer care number");
		System.out.println(Metro.theCustomerCareNumber());
		System.out.println(Metro.theCustomerCareNumber());
		System.out.println(Metro.theCustomerCareNumber());

		System.out.println("What is the Metro Bengaluru outlet area");
		System.out.println(Metro.theBengaluruOutletArea());
		System.out.println(Metro.theBengaluruOutletArea());
		System.out.println(Metro.theBengaluruOutletArea());

	}

	static void whatTypeOfCustomersCanShop(){
		System.out.println("Small, medium and large businesses can shop at Metro");
	}

	static void doesMetroProvideWholesaleProducts(){
		System.out.println("Yes Metro provides wholesale products");
	}

	static void doesMetroSellFoodProducts(){
		System.out.println("Yes Metro sells food and grocery products");
	}

	static void doesMetroProvideDeliveryService(){
		System.out.println("Yes Metro provides delivery support through logistics partners");
	}

	static int theYearMetroStartedInIndia(){
		int year = 2003;
		return year;
	}

	static int theNumberOfStatesWithMetroOutlets(){
		int states = 11;
		return states;
	}

	static long theCustomerCareNumber(){
		long phoneNumber = 18602662010L;
		return phoneNumber;
	}

	static String theBengaluruOutletArea(){
		String area = "Yeshwanthpur";
		return area;
	}
}

