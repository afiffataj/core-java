class StadiumRunner{
	public static void main(String[] args){
		
		Stadium stadium=new Stadium();
		System.out.println(stadium.name);
		System.out.println(stadium.color);
		System.out.println(stadium.city);
		System.out.println(stadium.capacity);
		
		stadium.name="salt lake";
		stadium.color="green";
		stadium.city="kolkata";
		stadium.capacity=50000;
		System.out.println(stadium.name);
		System.out.println(stadium.color);
		System.out.println(stadium.city);
		System.out.println(stadium.capacity);
		
		stadium.name="wembly";
		stadium.capacity=90000;
		System.out.println(stadium.name);
		System.out.println(stadium.capacity);
	}
}