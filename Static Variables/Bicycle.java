class Bicycle{
	static String brand;
	static int price;
	static short gear;
	static long serialNumber;
	static char size;
	static float weight;
	static boolean hasBell;
	static double wheelSize;

	public static void main(String[] args){
		System.out.println("Bicycle is used for transportation");

		int model=2024;
		String color="Red";
		byte quantity=3;
		char type='M';

		System.out.println("brand="+Bicycle.brand);
		System.out.println("price="+Bicycle.price);
		System.out.println("gear="+Bicycle.gear);
		System.out.println("serialNumber="+Bicycle.serialNumber);
		System.out.println("size="+Bicycle.size);
		System.out.println("weight="+Bicycle.weight);
		System.out.println("hasBell="+Bicycle.hasBell);
		System.out.println("wheelSize="+Bicycle.wheelSize);
		System.out.println(model);
		System.out.println(color);
		System.out.println(quantity);
		System.out.println(type);
	}
}