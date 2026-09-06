class Man{
	public static void main(String[] args){
		String fishName="salmon";
		int quantity=56;
		double price=400;
		FishShop.sell(fishName,quantity,price);
		FishShop.sell("tuna",110,570);
	}
}