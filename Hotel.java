class Hotel
{
    public static void order(String foodName, int quantity, double price,
	boolean parcel)
    {
        System.out.println("Food Name=" + foodName);
        System.out.println("Quantity=" + quantity);
        System.out.println("Price=" + price);
        System.out.println("Parcel=" + parcel);

        if(foodName == null || quantity <= 0 || price <= 0 || parcel == false)
        {
            System.out.println("Invalid Data");
        }
        else
        {
            System.out.println("Valid Data");
        }
    }
}