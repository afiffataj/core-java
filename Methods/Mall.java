class Mall {
	public static void main(String[] args) {

		System.out.println("What entertainment facilities are available in a mall");
		Mall.whatEntertainmentFacilitiesAreAvailable();
		Mall.whatEntertainmentFacilitiesAreAvailable();
		Mall.whatEntertainmentFacilitiesAreAvailable();

		System.out.println("Is parking available in the mall");
		Mall.isParkingAvailable();
		Mall.isParkingAvailable();
		Mall.isParkingAvailable();

		System.out.println("Can we watch movies in a mall");
		Mall.canWeWatchMovies();
		Mall.canWeWatchMovies();
		Mall.canWeWatchMovies();

		System.out.println("Are food courts available in the mall");
		Mall.areFoodCourtsAvailable();
		Mall.areFoodCourtsAvailable();
		Mall.areFoodCourtsAvailable();

		System.out.println("What is the name of a popular mall in Bengaluru");
		System.out.println(Mall.theNameOfPopularMall());
		System.out.println(Mall.theNameOfPopularMall());
		System.out.println(Mall.theNameOfPopularMall());

		System.out.println("How many floors does the mall have");
		System.out.println(Mall.theNumberOfFloors());
		System.out.println(Mall.theNumberOfFloors());
		System.out.println(Mall.theNumberOfFloors());

		System.out.println("What is the opening time of the mall");
		System.out.println(Mall.theOpeningTimeOfMall());
		System.out.println(Mall.theOpeningTimeOfMall());
		System.out.println(Mall.theOpeningTimeOfMall());

		System.out.println("Which city is the mall located in");
		System.out.println(Mall.theCityOfMall());
		System.out.println(Mall.theCityOfMall());
		System.out.println(Mall.theCityOfMall());

	}

	static void whatEntertainmentFacilitiesAreAvailable() {
		System.out.println("Malls may have gaming zones and entertainment areas");
	}

	static void isParkingAvailable() {
		System.out.println("Many malls provide parking facilities for visitors");
	}

	static void canWeWatchMovies() {
		System.out.println("Yes, malls with multiplex cinemas allow visitors to watch movies");
	}

	static void areFoodCourtsAvailable() {
		System.out.println("Many malls have food courts with different food options");
	}

	static String theNameOfPopularMall() {
		String mallName = "Orion Mall";
		return mallName;
	}

	static int theNumberOfFloors() {
		int floors = 5;
		return floors;
	}

	static String theOpeningTimeOfMall() {
		String openingTime = "10:00 AM";
		return openingTime;
	}

	static String theCityOfMall() {
		String city = "Bengaluru";
		return city;
	}
}
