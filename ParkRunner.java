class ParkRunner{
	public static void main(String[] args){
		
		Park park = new Park();
		System.out.println(park.name);
		System.out.println(park.brand);
		System.out.println(park.color);
		System.out.println(park.price);
		
		park.name = "Cubbon Park";
		park.brand = "BBMP";
		park.color = "Green";
		park.price = 20;  
		
		System.out.println(park.name);
		System.out.println(park.brand);
		System.out.println(park.color);
		System.out.println(park.price);
		
		park.color = "Dark Green";
		park.price = 30;
		
		System.out.println(park.color);
		System.out.println(park.price);

	}
}