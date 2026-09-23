class RestaurantForm{
	static String restaurantName="Spice Garden";
	static String restaurantLocation="Rajajinagar";
	static long contactNumber=9876543210l;
	static boolean homeDelivery=true;
	static String openingTime="10AM-11PM";

	public static void main(String[] args){
		System.out.println("RestaurantForm is used for proper maintanance");

		String foodName;
		int tableNumber;
		String foodType;
		float rating;
		byte price;

		System.out.println("1st Food");
		foodName="Masala Dosa";
		tableNumber=5;
		foodType="South Indian";
		rating=4.5f;
		price=80;

		System.out.println("restaurantName="+RestaurantForm.restaurantName);
		System.out.println("restaurantLocation="+RestaurantForm.restaurantLocation);
		System.out.println("contactNumber="+RestaurantForm.contactNumber);
		System.out.println("homeDelivery="+RestaurantForm.homeDelivery);
		System.out.println("openingTime="+RestaurantForm.openingTime);
		System.out.println("foodName="+foodName);
		System.out.println("tableNumber="+tableNumber);
		System.out.println("foodType="+foodType);
		System.out.println("rating="+rating);
		System.out.println("price="+price);
		System.out.println();

		System.out.println("2nd Food");
		foodName="Paneer Butter Masala";
		tableNumber=8;
		foodType="North Indian";
		rating=4.7f;
		price=100;

		System.out.println("restaurantName="+RestaurantForm.restaurantName);
		System.out.println("restaurantLocation="+RestaurantForm.restaurantLocation);
		System.out.println("contactNumber="+RestaurantForm.contactNumber);
		System.out.println("homeDelivery="+RestaurantForm.homeDelivery);
		System.out.println("openingTime="+RestaurantForm.openingTime);
		System.out.println("foodName="+foodName);
		System.out.println("tableNumber="+tableNumber);
		System.out.println("foodType="+foodType);
		System.out.println("rating="+rating);
		System.out.println("price="+price);
		System.out.println();

		System.out.println("3rd Food");
		foodName="Veg Biryani";
		tableNumber=12;
		foodType="Indian";
		rating=4.3f;
		price=120;

		System.out.println("restaurantName="+RestaurantForm.restaurantName);
		System.out.println("restaurantLocation="+RestaurantForm.restaurantLocation);
		System.out.println("contactNumber="+RestaurantForm.contactNumber);
		System.out.println("homeDelivery="+RestaurantForm.homeDelivery);
		System.out.println("openingTime="+RestaurantForm.openingTime);
		System.out.println("foodName="+foodName);
		System.out.println("tableNumber="+tableNumber);
		System.out.println("foodType="+foodType);
		System.out.println("rating="+rating);
		System.out.println("price="+price);
	}
}