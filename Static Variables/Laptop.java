class Laptop{
	static String brand;
	static int price;
	static short ram;
	static long serialNumber;
	static char grade;
	static float weight;
	static boolean isWorking;
	static double screenSize;

	public static void main(String[] args){
		System.out.println("Laptop is used for computing");

		int generation=13;
		String color="Silver";
		byte quantity=3;
		char size='M';

		System.out.println("brand="+Laptop.brand);
		System.out.println("price="+Laptop.price);
		System.out.println("ram="+Laptop.ram);
		System.out.println("serialNumber="+Laptop.serialNumber);
		System.out.println("grade="+Laptop.grade);
		System.out.println("weight="+Laptop.weight);
		System.out.println("isWorking="+Laptop.isWorking);
		System.out.println("screenSize="+Laptop.screenSize);
		System.out.println(generation);
		System.out.println(color);
		System.out.println(quantity);
		System.out.println(size);
	}
}