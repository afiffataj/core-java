class Boat1Runner{
	public static void main(String[] args){
		
		Boat1 boat1=new Boat1();
		System.out.println(boat1.name);
		System.out.println(boat1.brand);
		System.out.println(boat1.color);
		System.out.println(boat1.price);
		
		boat1.name="Speed Boat";
		boat1.brand="Bayliner";
		boat1.color="White";
		boat1.price=850000;
		System.out.println(boat1.name);
		System.out.println(boat1.brand);
		System.out.println(boat1.color);
		System.out.println(boat1.price);
		
		boat1.color="Blue";
		boat1.price=950000;
		System.out.println(boat1.color);
		System.out.println(boat1.price);

	}
}