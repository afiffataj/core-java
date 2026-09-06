class MobileShop
{
    public static void buy(String brand, String model, int price,
	boolean warranty)
    {
        System.out.println("Brand=" + brand);
        System.out.println("Model=" + model);
        System.out.println("Price=" + price);
        System.out.println("Warranty=" + warranty);

        if(brand == null || model == null || price <= 0 || warranty == false)
        {
            System.out.println("Invalid Data");
        }
        else
        {
            System.out.println("Valid Data");
        }
    }
}