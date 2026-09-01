class Country{
	public static String capitalCity(String countryName){
		System.out.println("running capitalCity in country");
		System.out.println("countryName="+countryName);
		return "delhi";
	}
	public static String countryCode(String countryName){
		System.out.println("countryName="+countryName);
		return "IND";
	}
	public static long population(String countryName){
		System.out.println("countryName="+countryName);
		return 400000L;
	}
	}