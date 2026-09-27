class Moisturizer{
	static String color;
	static float weight;
	static int length;
	static boolean isAvaiable;
	static char size;
	
	public static void main(String[] args){
		System.out.println("Moisturizer softers the face");
		
		String brand="Ponds";
		int price=599;
		byte discount=45;
		short noOfItem=1;
		
		Moisturizer.color="Cream";
		Moisturizer.weight=45.7f;
		Moisturizer.length=38;
		Moisturizer.isAvaiable=true;
		Moisturizer.size='m';
		
		System.out.println(Moisturizer.color);
		System.out.println(Moisturizer.weight);
		System.out.println(Moisturizer.length);
		System.out.println(Moisturizer.isAvaiable);
		System.out.println(Moisturizer.size);
		System.out.println(brand);
		System.out.println(price);
		System.out.println(discount);
		System.out.println(noOfItem);
	}
}
		
		
		