class Shop{
	public static double getPriceByName(String name)
	{
		System.out.println("running getPriceByName by shop");
		if(name==null)
		{
			System.out.println("name is invalid");
		}
		if (name == "onion")
		{
			return 99;
		}
		else if(name == "tomato")
		{
			return 50;
		}
		else if(name == "potato")
		{
			return 67;
		}
		else if(name == "chilli")
		{
			return 90;
		}
		else
		{
			System.out.println("name is valid");
		}
		return 0;
	}
}