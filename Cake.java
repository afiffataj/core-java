class Cake{
	
	String flavour="vanilla";
	int price=590;
	
	public Cake()
	{
		System.out.println("Cake is the non-primitive");
		
		this.flavour="chocolate";
		price=650;
       
	    String flavour="red velvet";  //local variables priority
		double weight=500;
		System.out.println(this.flavour);
		System.out.println(weight);
	}
}