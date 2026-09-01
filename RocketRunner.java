class RocketRunner{
	public static void main(String[] args){
		
		Rocket rocket=new Rocket();
		System.out.println(rocket.name);
		System.out.println(rocket.brand);
		System.out.println(rocket.color);
		System.out.println(rocket.price);
		
		rocket.name="falconX";
		rocket.brand="nova aerospace";
		rocket.color="silver";
		rocket.price=250000000;
		System.out.println(rocket.name);
		System.out.println(rocket.brand);
		System.out.println(rocket.color);
		System.out.println(rocket.price);
		
		rocket.color="black";
		rocket.price=500000000;
		System.out.println(rocket.color);
		System.out.println(rocket.price);
	}
}