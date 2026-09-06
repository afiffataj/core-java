class Noodles{
     
	String type="veg";
	int price=150;
	
	public Noodles()
	{
		System.out.println("Noodles are the non-primitive type");
		System.out.println("type="+type);
		System.out.println("price="+price);
		
		this.type="non veg";
		this.price=170;
		System.out.println(type);
		System.out.println(price);
		
		String color="yellowish";
		int quantity=3;
		System.out.println(color);
		System.out.println(quantity);
		System.out.println(this.type);// this keyword-local to instances
		System.out.println(this.price);
	}
}