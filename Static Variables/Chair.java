class Chair{
	static String brand;
	static int price;
	static short height;
	static long productCode;
	static char size;
	static float weight;
	static boolean isFoldable;
	static double width;

	public static void main(String[] args){
		System.out.println("Chair is used for sitting");

		int quantitySold=10;
		String color="Brown";
		byte quantity=8;
		char material='W';

		System.out.println("brand="+Chair.brand);
		System.out.println("price="+Chair.price);
		System.out.println("height="+Chair.height);
		System.out.println("productCode="+Chair.productCode);
		System.out.println("size="+Chair.size);
		System.out.println("weight="+Chair.weight);
		System.out.println("isFoldable="+Chair.isFoldable);
		System.out.println("width="+Chair.width);
		System.out.println(quantitySold);
		System.out.println(color);
		System.out.println(quantity);
		System.out.println(material);
	}
}