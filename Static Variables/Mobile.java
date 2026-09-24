class Mobile{
	static String brand;
	static int price;
	static short battery;
	static long imei;
	static char size;
	static float weight;
	static boolean is5G;
	static double screenSize;

	public static void main(String[] args){
		System.out.println("Mobile is used for communication");

		int modelNumber=2025;
		String color="Black";
		byte quantity=2;
		char rating='A';

		System.out.println("brand="+Mobile.brand);
		System.out.println("price="+Mobile.price);
		System.out.println("battery="+Mobile.battery);
		System.out.println("imei="+Mobile.imei);
		System.out.println("size="+Mobile.size);
		System.out.println("weight="+Mobile.weight);
		System.out.println("is5G="+Mobile.is5G);
		System.out.println("screenSize="+Mobile.screenSize);
		System.out.println(modelNumber);
		System.out.println(color);
		System.out.println(quantity);
		System.out.println(rating);
	}
}