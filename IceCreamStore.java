class IceCreamStore{
	public static void save(String name,String flavour,int cost,char size,
	boolean cone,boolean cup){
		System.out.println("ice cream are save in icecreamstore");
		if(name!=null)
		{
			System.out.println("name is valid");
		}
		if(flavour!=null)
		{
			System.out.println("flavour is valid");
		}
		if(cost>=100)
		{
			System.out.println("cost is invalid");
		}
		if(size=='l' || size=='s')
		{
			System.out.println("size is valid");
		}
		if(cone==false)
		{
			System.out.println("cone is invalid");
		}
		if(cup==true)
		{
			System.out.println("cup is valid");
		}
	}
}