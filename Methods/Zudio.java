class Zudio{
	public static void main(String[] args){

		System.out.println("the no of types of clothes in zudio");
		Zudio.theNoOfTypesOfClothes();
		Zudio.theNoOfTypesOfClothes();
		Zudio.theNoOfTypesOfClothes();

		System.out.println("is mens clothing available in zudio");
		Zudio.isMensClothingAvailable();
		Zudio.isMensClothingAvailable();
		Zudio.isMensClothingAvailable();

		System.out.println("is womens clothing available in zudio");
		Zudio.isWomensClothingAvailable();
		Zudio.isWomensClothingAvailable();
		Zudio.isWomensClothingAvailable();

		System.out.println("are footwear available in zudio");
		Zudio.areFootwearAvailable();
		Zudio.areFootwearAvailable();
		Zudio.areFootwearAvailable();

		System.out.println("the owner name of zudio");
		System.out.println(Zudio.theOwnerNameOfZudio());
		System.out.println(Zudio.theOwnerNameOfZudio());
		System.out.println(Zudio.theOwnerNameOfZudio());

		System.out.println("the number of zudio stores");
		System.out.println(Zudio.theNumberOfZudioStores());
		System.out.println(Zudio.theNumberOfZudioStores());
		System.out.println(Zudio.theNumberOfZudioStores());

		System.out.println("the starting price of clothes in zudio");
		System.out.println(Zudio.theStartingPriceOfClothes());
		System.out.println(Zudio.theStartingPriceOfClothes());
		System.out.println(Zudio.theStartingPriceOfClothes());

		System.out.println("the address of zudio");
		System.out.println(Zudio.theAddressOfZudio());
		System.out.println(Zudio.theAddressOfZudio());
		System.out.println(Zudio.theAddressOfZudio());
	}

	static void theNoOfTypesOfClothes(){
		System.out.println("There are many types of clothes available in Zudio");
	}

	static void isMensClothingAvailable(){
		System.out.println("Yes mens clothing is available in Zudio");
	}

	static void isWomensClothingAvailable(){
		System.out.println("Yes womens clothing is available in Zudio");
	}

	static void areFootwearAvailable(){
		System.out.println("Yes footwear is available in Zudio");
	}

	static String theOwnerNameOfZudio(){
		String ownerName = "Trent Limited";
		return ownerName;
	}

	static int theNumberOfZudioStores(){
		int stores = 500;
		return stores;
	}

	static int theStartingPriceOfClothes(){
		int price = 199;
		return price;
	}

	static String theAddressOfZudio(){
		String address = "Bangalore";
		return address;
	}
}

