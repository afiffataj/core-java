class FoodIngredient{
	public static String[] findIngredientsByFood(String foodName){
		System.out.println("running FoodIngredient in findIngredientsByFood");
		System.out.println("foodName="+foodName);
		
		//biryani,jamun,gobi,fried rice
		
		if(foodName == "Biryani")
		{
			System.out.println("Biryani is the foodName");
			String[] foodIngredient={"rice","chiken","oil","ghee","coriander",
			"ginger-garlic paste","onion","yogurt","spices"}; 
			return foodIngredient;
		}
		
		else if(foodName == "Jamun")
		{
			System.out.println("Jamun is the desertName");
			String[] foodIngredient={"milk","baking soda","gulab janum","sugar","ghee"};
			return foodIngredient;
		}
		
		else if(foodName == "Gobi")
		{
			System.out.println("Gobi is the foodName");
			String[] foodIngredient={"cauliflower","potatos","ginger","garlic",
			"oil","tomatoes","spices"};
			return foodIngredient;
		}
		
		else if(foodName == "Fried Rice")
		{
			System.out.println("Fried Rice is the foodName");
			String[] foodIngredient={"oil","rice","chilli","eggs","vegetables"};
			return foodIngredient;
		}
		System.out.println("name not matched,return empty");
		String[] empty={};
		return empty;
	}
}