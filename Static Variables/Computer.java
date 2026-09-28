class Computer{
	static String brand;
	static int price;
	static short ram;
	static long serialNumber;
	static char size;
	static float weight;
	static boolean isWorking;
	static double storage;

	public static void main(String[] args){
		System.out.println("Computer is used for performing tasks");

		int model=2025;
		String color="Black";
		byte quantity=3;
		char grade='A';

		System.out.println("brand="+Computer.brand);
		System.out.println("price="+Computer.price);
		System.out.println("ram="+Computer.ram);
		System.out.println("serialNumber="+Computer.serialNumber);
		System.out.println("size="+Computer.size);
		System.out.println("weight="+Computer.weight);
		System.out.println("isWorking="+Computer.isWorking);
		System.out.println("storage="+Computer.storage);
		System.out.println(model);
		System.out.println(color);
		System.out.println(quantity);
		System.out.println(grade);
	}
}