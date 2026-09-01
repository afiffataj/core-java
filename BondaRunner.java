class BondaRunner{
	public static void main(String[] args){
		
		Bonda bonda=new Bonda();
		System.out.println(bonda.name);
		System.out.println(bonda.brand);
		System.out.println(bonda.color);
		System.out.println(bonda.price);
		
		bonda.name="Potato Bonda";
		bonda.brand="MTR";
		bonda.color="Golden Brown";
		bonda.price=40;
		System.out.println(bonda.name);
		System.out.println(bonda.brand);
		System.out.println(bonda.color);
		System.out.println(bonda.price);
		
		bonda.color="Dark Brown";
		bonda.price=50;
		System.out.println(bonda.color);
		System.out.println(bonda.price);

	}
}