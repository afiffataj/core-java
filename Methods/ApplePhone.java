class ApplePhone{
	static String brand="Apple";
	static String operatingSystem="ios";
	static double cpuSpeed=10.1d;
	static int memory=256;
	static String countryOfOrigin="India";
	
	public static void main(String[] args){
		String color="Blue";
		int discount=45;
		double weight=345.8d;
		long productNo=3456709876l;
		String genericName="iPhone 17 Pro";
		
		System.out.println(ApplePhone.brand);
		System.out.println(ApplePhone.operatingSystem);
		System.out.println(ApplePhone.cpuSpeed);
		System.out.println(ApplePhone.memory);
		System.out.println(ApplePhone.countryOfOrigin);
		System.out.println(color);
		System.out.println(discount);
		System.out.println(weight);
		System.out.println(productNo);
		System.out.println(genericName);
		ApplePhone.canWeUse();
		ApplePhone.doesItHaveHighMemory();
		ApplePhone.itIsUnbreakable();
		ApplePhone.isItFoldable();
		ApplePhone.isItEasyToHandle();
		
	}
	static void canWeUse(){
		System.out.println("Yes we can use ApplePhone");
	}
	static void doesItHaveHighMemory(){
		System.out.println("Yes it has high memory storage");
	}
	static void itIsUnbreakable(){
		System.out.println("Yes it is un-breakable");
	}
	static void isItFoldable(){
		System.out.println("No it is not foldable");
	}
    static void isItEasyToHandle(){
        System.out.println("Yes it is easy to handle");
	}		
}
