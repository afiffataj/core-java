class SchoolBag{
	static String brand;
	static int price;
	static short capacity;
	static long productCode;
	static char size;
	static float weight;
	static boolean isWaterProof;
	static double height;

	public static void main(String[] args){
		System.out.println("SchoolBag is used for carrying books");

		int books=8;
		String color="Blue";
		byte quantity=5;
		char quality='A';

		System.out.println("brand="+SchoolBag.brand);
		System.out.println("price="+SchoolBag.price);
		System.out.println("capacity="+SchoolBag.capacity);
		System.out.println("productCode="+SchoolBag.productCode);
		System.out.println("size="+SchoolBag.size);
		System.out.println("weight="+SchoolBag.weight);
		System.out.println("isWaterProof="+SchoolBag.isWaterProof);
		System.out.println("height="+SchoolBag.height);
		System.out.println(books);
		System.out.println(color);
		System.out.println(quantity);
		System.out.println(quality);
	}
}