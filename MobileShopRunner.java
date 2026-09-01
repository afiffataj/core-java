class MobileShopRunner
{
    public static void main(String... args)
    {
		String brand="vivo";
		String model="x50";
		int price=50000;
	    boolean warranty=true;
		
		MobileShop.buy(brand,model,price,warranty);
		
        MobileShop.buy("Samsung","S24",70000,true);

        MobileShop.buy("Apple","iPhone 15",80000,true);

        MobileShop.buy(null,"Vivo V30",-100,false);
    }
}