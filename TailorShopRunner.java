class TailorShopRunner
{
    public static void main(String... args)
    {
		String dressType="null";
		double width=25.4;
	    String material="silk";
		String pattern="design";
		int price=9000;
	    boolean iron=true;
		String date="12-12-2001";
	    double time=4.0;
TailorShop.stitch(dressType,width,material,pattern,price,iron,date,time);	
		
TailorShop.stitch("Shirt",40.5,"Cotton","Plain",800,true,"10-08-2026",2.5);

TailorShop.stitch(null,0,"Silk","Checks",-100,false,null,0);
    }
}