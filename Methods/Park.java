class Park {
	public static void main(String[] args) {

		System.out.println("Is park open");
		Park.isParkOpen();
		Park.isParkOpen();
		Park.isParkOpen();

		System.out.println("Are walking paths available");
		Park.areWalkingPathsAvailable();
		Park.areWalkingPathsAvailable();
		Park.areWalkingPathsAvailable();

		System.out.println("Are children's play areas available");
		Park.arePlayAreasAvailable();
		Park.arePlayAreasAvailable();
		Park.arePlayAreasAvailable();

		System.out.println("Are benches available");
		Park.areBenchesAvailable();
		Park.areBenchesAvailable();
		Park.areBenchesAvailable();

		System.out.println("Park name");
		System.out.println(Park.getParkName());
		System.out.println(Park.getParkName());
		System.out.println(Park.getParkName());

		System.out.println("Number of gates");
		System.out.println(Park.getNumberOfGates());
		System.out.println(Park.getNumberOfGates());
		System.out.println(Park.getNumberOfGates());

		System.out.println("Park area");
		System.out.println(Park.getParkArea());
		System.out.println(Park.getParkArea());
		System.out.println(Park.getParkArea());

		System.out.println("Park location");
		System.out.println(Park.getParkLocation());
		System.out.println(Park.getParkLocation());
		System.out.println(Park.getParkLocation());
	}

	static void isParkOpen() {
		System.out.println("Yes, the park is open");
	}

	static void areWalkingPathsAvailable() {
		System.out.println("Yes, walking paths are available");
	}

	static void arePlayAreasAvailable() {
		System.out.println("Yes, children's play areas are available");
	}

	static void areBenchesAvailable() {
		System.out.println("Yes, benches are available");
	}

	static String getParkName() {
		return "Green Garden Park";
	}

	static int getNumberOfGates() {
		return 3;
	}

	static double getParkArea() {
		return 5.5;
	}

	static String getParkLocation() {
		return "Mysuru";
	}
}
