class Fan{
	static String brand;
	static int price;
	static short speed;
	static long serialNumber;
	static char size;
	static float height;
	static boolean isWorking;
	static double powerConsumption;

	public static void main(String[] args){
		System.out.println("Fan is used for cooling");

		int warranty=3;
		String color="White";
		byte quantity=5;
		char model='A';

		System.out.println("brand="+Fan.brand);
		System.out.println("price="+Fan.price);
		System.out.println("speed="+Fan.speed);
		System.out.println("serialNumber="+Fan.serialNumber);
		System.out.println("size="+Fan.size);
		System.out.println("height="+Fan.height);
		System.out.println("isWorking="+Fan.isWorking);
		System.out.println("powerConsumption="+Fan.powerConsumption);
		System.out.println(warranty);
		System.out.println(color);
		System.out.println(quantity);
		System.out.println(model);
	}
}