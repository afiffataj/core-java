class TailorShop
{
    public static void stitch(String dressType,double width,
	String material,String pattern,int price,boolean iron,String date,
	double time)
    {
        System.out.println("dressType="+dressType);
		System.out.println("width="+width);
        System.out.println("material="+material);
        System.out.println("pattern="+pattern);
        System.out.println("price="+price);
        System.out.println("iron="+iron);
        System.out.println("date="+date);
        System.out.println("time="+time);

        if(dressType == null || width <= 0 || material == null ||
            pattern == null || price <= 0 || iron==false || date == null ||
               time <= 0)
        {
            System.out.println("Invalid Data");
        }
        else
        {
            System.out.println("Valid Data");
        }
    }
}