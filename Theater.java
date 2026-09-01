class Theater{
	public static void book(String movieName,int quantity,String screen,
	boolean discount,boolean orderSnacks){
		System.out.println("movieName="+movieName);
		System.out.println("quantity="+quantity);
		System.out.println("screen="+screen);
		System.out.println("discount="+discount);
		System.out.println("orderSnacks="+orderSnacks);
		if(movieName==null || quantity<=0 || quantity>=10 ||
		screen==null || discount==false || orderSnacks==false)
		{
			System.out.println("invalid data");
		}
		else
		{
			System.out.println("valid data");
		}
	}
}