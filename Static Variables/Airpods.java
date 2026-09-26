class Airpods{
	static byte warrenty;
	static int deliveryFee;
	static boolean available;
	static short batteryInHrs;
	static String formFactor;
	
	public static void main(String[] args){
		System.out.println("Airpods are very useful");
		
		int price=999;
		String brand="Boat";
		String color="White";
		
	Airpods.warrenty=4;
	Airpods.deliveryFee=79;
	Airpods.available=true;
	Airpods.batteryInHrs=60;
	Airpods.formFactor="True Wireless";
		
		System.out.println(Airpods.warrenty);
		System.out.println(Airpods.deliveryFee);
		System.out.println(Airpods.available);
		System.out.println(Airpods.batteryInHrs);
		System.out.println(Airpods.formFactor);
		System.out.println(price);
		System.out.println(brand);
		System.out.println(color);
	}
}