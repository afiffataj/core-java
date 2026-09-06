class FoodRunner{
	public static void main(String[] args){
		String name="Samosa";
		String type="nonVegSamosa";
		int price=FoodService.getPriceByFoodItemAndType(name,type);
		System.out.println("price="+price);
	
        String name1="Kiwi";
        int price1=	FoodService.getPriceByJuiceName(name1);
		System.out.println("price1="+price1);
		
		double bill=4000;
		String sponsor=FoodService.getSponsorNameByTotalBill(bill);
		System.out.println("sponsor="+sponsor);
	
	}
}