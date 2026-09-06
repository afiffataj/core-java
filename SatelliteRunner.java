class SatelliteRunner{
	public static void main(String[] args){
		
		Satellite satellite=new Satellite();
		System.out.println(satellite.color);
		System.out.println(satellite.brand);
		System.out.println(satellite.name);
		System.out.println(satellite.price);
		
		satellite.color="multicolor";
		satellite.brand="isro";
		satellite.name="insat-3ds";
		satellite.price=50000000;
		System.out.println(satellite.color);
		System.out.println(satellite.brand);
		System.out.println(satellite.name);
		System.out.println(satellite.price);
		
	}
}