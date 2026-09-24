class Car{
	static String brand;
	static int price;
	static short mileage;
	static long registrationNumber;
	static char model;
	static float speed;
	static boolean isAvailable;
	static double engineCapacity;

	public static void main(String[] args){
		System.out.println("Car is used for transportation");

		int year=2025;
		String color="White";
		byte quantity=2;
		char fuelType='P';

		System.out.println("brand="+Car.brand);
		System.out.println("price="+Car.price);
		System.out.println("mileage="+Car.mileage);
		System.out.println("registrationNumber="+Car.registrationNumber);
		System.out.println("model="+Car.model);
		System.out.println("speed="+Car.speed);
		System.out.println("isAvailable="+Car.isAvailable);
		System.out.println("engineCapacity="+Car.engineCapacity);
		System.out.println(year);
		System.out.println(color);
		System.out.println(quantity);
		System.out.println(fuelType);
	}
}