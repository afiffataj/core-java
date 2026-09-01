class BorewellRunner{
	public static void main(String[] args){
		
		Borewell borewell=new Borewell();
		System.out.println(borewell.name);
		System.out.println(borewell.brand);
		System.out.println(borewell.color);
		System.out.println(borewell.price);
		
		borewell.name="Deep Borewell";
		borewell.brand="Kirloskar";
		borewell.color="Blue";
		borewell.price=85000;
		System.out.println(borewell.name);
		System.out.println(borewell.brand);
		System.out.println(borewell.color);
		System.out.println(borewell.price);
		
		borewell.color="Green";
		borewell.price=95000;
		System.out.println(borewell.color);
		System.out.println(borewell.price);

	}
}