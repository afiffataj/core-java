class MuttonRunner{
	public static void main(String[] args){
		
		Mutton mutton=new Mutton();
		System.out.println(mutton.name);
		System.out.println(mutton.brand);
		System.out.println(mutton.color);
		System.out.println(mutton.price);
		
		mutton.name="Fresh Mutton";
		mutton.brand="Meat Mart";
		mutton.color="Red";
		mutton.price=800;
		System.out.println(mutton.name);
		System.out.println(mutton.brand);
		System.out.println(mutton.color);
		System.out.println(mutton.price);
		
		mutton.color="Dark Red";
		mutton.price=900;
		System.out.println(mutton.color);
		System.out.println(mutton.price);

	}
}