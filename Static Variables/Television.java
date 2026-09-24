class Television{
	static String brand;
	static int price;
	static short channels;
	static long serialNumber;
	static char size;
	static float width;
	static boolean isSmart;
	static double screenSize;

	public static void main(String[] args){
		System.out.println("Television is used for entertainment");

		int warranty=2;
		String color="Black";
		byte quantity=4;
		char rating='A';

		System.out.println("brand="+Television.brand);
		System.out.println("price="+Television.price);
		System.out.println("channels="+Television.channels);
		System.out.println("serialNumber="+Television.serialNumber);
		System.out.println("size="+Television.size);
		System.out.println("width="+Television.width);
		System.out.println("isSmart="+Television.isSmart);
		System.out.println("screenSize="+Television.screenSize);
		System.out.println(warranty);
		System.out.println(color);
		System.out.println(quantity);
		System.out.println(rating);
	}
}