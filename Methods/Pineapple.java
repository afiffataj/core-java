class Pineapple{
	public static void main(String[] args){
		
		System.out.println("what is the pineapple price");
		System.out.println(Pineapple.whatIsThePriceOfPineapple());
		
		System.out.println("what is the pineapple color");
		String color=Pineapple.whatIsTheColorOfPineapple();
		System.out.println(color);
		
		System.out.println("what is the pineapple weight");
		float weight=Pineapple.whatIsTheWeightOfPineapple();
		System.out.println(weight);
		
		System.out.println("what is the pineapple length");
		double length=Pineapple.whatIsTheLengthOfPineapple();
		System.out.println(length);
		
	}
	static byte whatIsThePriceOfPineapple(){
		byte price=100;
		return price;
	}
	
	static String whatIsTheColorOfPineapple(){
		String color="Yellow";
		return color;
	}
	
	static float whatIsTheWeightOfPineapple(){
		float weight=55.7f;
		return weight;
	}
	
	static double whatIsTheLengthOfPineapple(){
		double length=45.9d;
		return length;
	}
}