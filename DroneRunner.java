class DroneRunner{
	public static void main(String[] args){
		
		Drone drone=new Drone();
		System.out.println(drone.name);
		System.out.println(drone.brand);
		System.out.println(drone.color);
		System.out.println(drone.price);
		
		drone.name="Camera Drone";
		drone.brand="DJI";
		drone.color="Grey";
		drone.price=45000;
		System.out.println(drone.name);
		System.out.println(drone.brand);
		System.out.println(drone.color);
		System.out.println(drone.price);
		
		drone.color="Black";
		drone.price=50000;
		System.out.println(drone.color);
		System.out.println(drone.price);

	}
}