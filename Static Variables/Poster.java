class Poster{
	static char size='L';
	static float length=55.7f;
	static boolean stickable=true;
	
	public static void main(String[] args){
		byte noOfPosters=5;
		String nameOnPoster="Java Features";
		int price=100;
		boolean isAvailable=true;
		String color="Red";
		
		System.out.println("size of Poster="+Poster.size);
		System.out.println("length of Poster="+Poster.length);
		System.out.println("stickable of Poster="+Poster.stickable);
		System.out.println("no of Poster="+noOfPosters);
		System.out.println("name of Poster="+nameOnPoster);
		System.out.println("price of Poster="+price);
		System.out.println("isAvailable Poster="+isAvailable);
		System.out.println("color of Poster="+color);
	}
}