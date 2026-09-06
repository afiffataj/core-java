class FoodIngredientRunner{
	public static void main(String[] args){
		String foodName="Gobi";
		String[] totalIngredient=FoodIngredient.findIngredientsByFood(foodName);
		//System.out.println("totalIngredient="+totalIngredient.length);
		int product=totalIngredient.length;
		System.out.println("product="+product);
	}
}