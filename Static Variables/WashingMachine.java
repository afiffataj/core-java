class WashingMachine{
	static byte discount=15;
	static int watts=500;
	static boolean available=true;
	static float itemWeight=32.5f;
	static short warrenty=3;

	public static void main(String[] args){
		System.out.println("WashingMachine is used for washing clothes");

		String brand="LG";
		String color="White";
		int capacity=8;
		byte size=8;
		short price=28500;

		System.out.println("discount="+discount);
		System.out.println("watts="+watts);
		System.out.println("available="+available);
		System.out.println("itemWeight="+itemWeight);
		System.out.println("warrenty="+warrenty);
		System.out.println("brand="+brand);
		System.out.println("color="+color);
		System.out.println("capacity="+capacity);
		System.out.println("size="+size);
		System.out.println("price="+price);
	}
}