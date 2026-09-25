class Table{
	static String brand;
	static int price;
	static short height;
	static long productCode;
	static char size;
	static float weight;
	static boolean isFoldable;
	static double width;

	public static void main(String[] args){
		System.out.println("Table is used for keeping things");

		int quantitySold=15;
		String color="Brown";
		byte quantity=6;
		char material='W';

		System.out.println("brand="+Table.brand);
		System.out.println("price="+Table.price);
		System.out.println("height="+Table.height);
		System.out.println("productCode="+Table.productCode);
		System.out.println("size="+Table.size);
		System.out.println("weight="+Table.weight);
		System.out.println("isFoldable="+Table.isFoldable);
		System.out.println("width="+Table.width);
		System.out.println(quantitySold);
		System.out.println(color);
		System.out.println(quantity);
		System.out.println(material);
	}
}