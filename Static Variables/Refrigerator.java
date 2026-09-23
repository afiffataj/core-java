class Refrigerator{
	static byte discount=20;
	static int watts=250;
	static boolean available=true;
	static float itemWeight=45.75f;
	static short warrenty=2;

	public static void main(String[] args){
		System.out.println("Refrigerator is used for storing food");

		String brand="Samsung";
		String color="Silver";
		int capacity=653;
		byte size=103;
		short price=32000;

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