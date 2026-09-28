class Printer{
	static String brand;
	static int price;
	static short pagesPerMinute;
	static long serialNumber;
	static char size;
	static float weight;
	static boolean isWorking;
	static double paperSize;

	public static void main(String[] args){
		System.out.println("Printer is used for printing documents");

		int warranty=2;
		String color="White";
		byte quantity=4;
		char model='B';

		System.out.println("brand="+Printer.brand);
		System.out.println("price="+Printer.price);
		System.out.println("pagesPerMinute="+Printer.pagesPerMinute);
		System.out.println("serialNumber="+Printer.serialNumber);
		System.out.println("size="+Printer.size);
		System.out.println("weight="+Printer.weight);
		System.out.println("isWorking="+Printer.isWorking);
		System.out.println("paperSize="+Printer.paperSize);
		System.out.println(warranty);
		System.out.println(color);
		System.out.println(quantity);
		System.out.println(model);
	}
}