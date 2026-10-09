class FishStall{
	public static void main(String[] args){
		
		System.out.println("Is fish stall available today");
		FishStall.isFishStallAvaiableToday();
		FishStall.isFishStallAvaiableToday();
		FishStall.isFishStallAvaiableToday();
		
		System.out.println("what Type Of Fish Is In Stall");
		System.out.println(FishStall.whatTypeOfFishIsInStall());
		System.out.println(FishStall.whatTypeOfFishIsInStall());
		System.out.println(FishStall.whatTypeOfFishIsInStall());
	}
	
	static void isFishStallAvaiableToday(){
		System.out.println("Yes fish stall is available today");
	}
	
	static String whatTypeOfFishIsInStall(){
		String type="Bony Fish";
		return type;
	}
}