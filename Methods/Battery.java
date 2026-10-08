class Battery{
	public static void main(String[] args){
		
		System.out.println("is battery available");
		boolean isAvailable=Battery.isBatteryAvailableInShop();
		System.out.println(isAvailable);
		
		System.out.println("battery price");
		int price=Battery.thePriceOfBattery();
		System.out.println(price);
		
		System.out.println("battery color");
		String color=Battery.theColorOfBattery();
		System.out.println(color);
		
        Battery.theCapacityOfTheBattery();
		Battery.theWarrentyOfTheBattery();
		Battery.theWeightOfTheBattery();
	}
	static boolean isBatteryAvailableInShop(){
		boolean isAvailable=true;
		return isAvailable;
	}
	
	static int thePriceOfBattery(){
		int price=4500;
		return price;
	}
	
	static String theColorOfBattery(){
		String color="Black";
		return color;
	}
	
	static void theCapacityOfTheBattery(){
		System.out.println("the capacity of the battery is high");
	}
	
	static void theWarrentyOfTheBattery(){
		System.out.println("the warrenty of the battery is 2 years");
	}
	
	static void theWeightOfTheBattery(){
		System.out.println("the weight of the battery is 15kg");
	}
}