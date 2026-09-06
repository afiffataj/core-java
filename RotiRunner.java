class RotiRunner{
	public static void main(String[] args){
		
		Roti roti = new Roti();
		System.out.println(roti.name);
		System.out.println(roti.brand);
		System.out.println(roti.color);
		System.out.println(roti.price);
		
		roti.name = "Chapati Roti";
		roti.brand = "Aashirvaad";
		roti.color = "Light Brown";
		roti.price = 50;
		
		System.out.println(roti.name);
		System.out.println(roti.brand);
		System.out.println(roti.color);
		System.out.println(roti.price);
		
		roti.color = "Golden Brown";
		roti.price = 60;
		
		System.out.println(roti.color);
		System.out.println(roti.price);

	}
}