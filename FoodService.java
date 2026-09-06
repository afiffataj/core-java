class FoodService{
	public static int getPriceByFoodItemAndType(String name,
	String type){
	System.out.println("running getPriceByFoodItemAndType in food");
	System.out.println("name=" + name);
	System.out.println("type=" + type);
	
	String foodName="Biryani";
	int vegBiryani=150;
	int nonVegBiryani=200;
	
	if(name == "Biryani")
	{
	  if(type == "vegBiryani")
	  {
		  System.out.println("Biryani is veg");
		  return 150;
	  }
		  else if(type == "nonVegBiryani")
		  {
			  System.out.println("Biryani is nonVeg");
		      return 200;
	      }		  
	}
	// fried rice
	String foodName1="Fried Rice";
	int vegFriedRice=120;
	int nonVegFriedRice=150;
	
	if(name == "Fried Rice")
	{
	  if(type == "vegFriedRice")
	  {
		  System.out.println("Fried rice is veg");
		  return 120;
	  }
		  else if(type == "nonVegFriedRice")
		  {
			  System.out.println("Fried rice is nonVeg");
		      return 150;
		  }	  
	}
	
	//samosa 
	
	String foodName2="Samosa";
	int vegSamosa=20;
	int nonVegSamosa=40;
	
     if(name == "Samosa")
	{
	  if(type == "vegSamosa")
	  {
		  System.out.println("Samosa is veg");
		  return 20;
	  }
		  else if(type == "nonVegSamosa")
		  {
			  System.out.println("Samosa is nonVeg");
		      return 40;
		  }	  
	}
	
	return 0;
	}
	//juice name
	
	public static int getPriceByJuiceName(String name){
    System.out.println("running getPriceByJuiceName in foodservice");
	System.out.println("name="+name);
		
		//mango
		String juiceName="Mango";
		int mangoJuice=80;
		if(name == "Mango")
		{
			System.out.println("price of mango is 80");
			return 80;
		}
		
		//apple
	    String juiceName1="Apple";
		int appleJuice=90;
		if(name == "Apple")
		{
			System.out.println("price of apple is 90");
			return 90;
		}
	
	    //banana
		String juiceName2="Banana";
		int bananaJuice=100;
		if(name == "Banana")
		{
			System.out.println("price of banana is 80");
			return 100;
		}
	
	    //kiwi
		String juiceName3="Kiwi";
		int kiwiJuice=150;
		if(name == "Kiwi")
		{
			System.out.println("price of kiwi is 150");
			return 150;
		}
	
	    //pinapple
		String juiceName4="Pineapple";
		int pineappleJuice=180;
		if(name == "Pineapple")
		{
			System.out.println("price of pineapple is 180");
			return 180;
		}
	return 0;
	}
	
	//sponsor
	public static String getSponsorNameByTotalBill(double bill)
   {
    System.out.println("running getSponsorNameByTotalBill in foodservice");
    System.out.println("bill="+bill);

    //tata
    String sponsorName="Tata";
    double tataBill=5000;
    if(bill >= 5000)
    {
        System.out.println("sponsor name is Tata");
        return "Tata";
    }

    //infosys
    String sponsorName1="Infosys";
    double infosysBill=4000;
    if(bill >= 4000)
    {
        System.out.println("sponsor name is Infosys");
        return "Infosys";
    }

    //wipro
    String sponsorName2="Wipro";
    double wiproBill=3000;
    if(bill >= 3000)
    {
        System.out.println("sponsor name is Wipro");
        return "Wipro";
    }

    //google
    String sponsorName3="Google";
    double googleBill=2000;
    if(bill >= 2000)
    {
        System.out.println("sponsor name is Google");
        return "Google";
    }

    //microsoft
    String sponsorName4="Microsoft";
    double microsoftBill=1000;
    if(bill >= 1000)
    {
        System.out.println("sponsor name is Microsoft");
        return "Microsoft";
    }
	
    return "No Sponsor";
}
}