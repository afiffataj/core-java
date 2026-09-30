class Rocket{
	static String country;
	static int fuelCapacity;
	static short stages;
	static long launchCode;
	static char type;
	static float height;
	static boolean isReusable;
	static double speed;

	public static void main(String[] args){
		System.out.println("Rocket is used for space exploration");

		int year=2026;
		String mission="Moon";
		byte quantity=2;
		char grade='A';

		System.out.println("country="+Rocket.country);
		System.out.println("fuelCapacity="+Rocket.fuelCapacity);
		System.out.println("stages="+Rocket.stages);
		System.out.println("launchCode="+Rocket.launchCode);
		System.out.println("type="+Rocket.type);
		System.out.println("height="+Rocket.height);
		System.out.println("isReusable="+Rocket.isReusable);
		System.out.println("speed="+Rocket.speed);
		System.out.println(year);
		System.out.println(mission);
		System.out.println(quantity);
		System.out.println(grade);
	}
}