class Camera{
	static String brand="Sony";
	static byte discount=31;
	static int aspectRatio=16;
	static String imageStability="Optical";
	static String photoSensor="CMOS";
	
	public static void main(String[] args){
		int price=12378;
		String color="Black";
		short weight=658;
		boolean isAvailable=true;
		int inch=8;
		
		System.out.println(Camera.brand);
		System.out.println(Camera.discount);
		System.out.println(Camera.aspectRatio);
		System.out.println(Camera.imageStability);
		System.out.println(Camera.photoSensor);
		System.out.println(price);
		System.out.println(color);
		System.out.println(weight);
		System.out.println(isAvailable);
		System.out.println(inch);
		Camera.areThisZoomable();
		Camera.areTheyAvailable();
		Camera.areTheyLongLasting();
		Camera.areTheyFlexible();
	}
	static void areThisZoomable(){
		System.out.println("Yes they can be zoomed");
	}
	static void areTheyAvailable(){
		System.out.println("Yes currently they r available");
	}
	static void areTheyLongLasting(){
		System.out.println("Yes they are long lasting");
	}
	static void areTheyFlexible(){
		System.out.println("No they are not flexiblle");
	}
}
		