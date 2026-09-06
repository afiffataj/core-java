class CountryRunner{
	public static void main(String[] args){
		String countryName="India";
		String refName=Country.capitalCity(countryName);
		String refName1=Country.countryCode(countryName);
		long refName2=Country.population(countryName);
		System.out.println("refName="+refName);
		System.out.println("refName1="+refName1);
		System.out.println("refName2="+refName2);
		
	}
}