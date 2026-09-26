class AirConditioner{
	static String brand;
	static int price;
	static short capacity;
	static long serialNumber;
	static char size;
	static float weight;
	static boolean isWorking;
	static double temperature;

	public static void main(String[] args){
		System.out.println("AirConditioner is used for cooling rooms");

		int warranty=3;
		String color="White";
		byte quantity=4;
		char rating='A';

		System.out.println("brand="+AirConditioner.brand);
		System.out.println("price="+AirConditioner.price);
		System.out.println("capacity="+AirConditioner.capacity);
		System.out.println("serialNumber="+AirConditioner.serialNumber);
		System.out.println("size="+AirConditioner.size);
		System.out.println("weight="+AirConditioner.weight);
		System.out.println("isWorking="+AirConditioner.isWorking);
		System.out.println("temperature="+AirConditioner.temperature);
		System.out.println(warranty);
		System.out.println(color);
		System.out.println(quantity);
		System.out.println(rating);
	}
}