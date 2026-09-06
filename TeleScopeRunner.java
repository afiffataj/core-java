class TeleScopeRunner{
	public static void main(String[] args){
		
		TeleScope telescope=new TeleScope();
		System.out.println(telescope.brand);
		System.out.println(telescope.color);
		System.out.println(telescope.price);
		System.out.println(telescope.weight);
		
		telescope.brand="tesla";
		telescope.color="white";
		telescope.price=3000;
		telescope.weight=45;
		System.out.println(telescope.brand);
		System.out.println(telescope.color);
		System.out.println(telescope.price);
		System.out.println(telescope.weight);
		
	}
}