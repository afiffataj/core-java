class Tomato{
	public static void main(String[] args){
		
		System.out.println("what is the tomato price");
		System.out.println(Tomato.whatIsThePriceOfTomato());
		
		System.out.println("what is the tomato color");
		String color=Tomato.whatIsTheColorOfTomato();
		System.out.println(color);
		
		System.out.println("what is the tomato weight");
		float weight=Tomato.whatIsTheWeightOfTomato();
		System.out.println(weight);
		
		System.out.println("what is the tomato length");
		double length=Tomato.whatIsTheLengthOfTomato();
		System.out.println(length);
		
	}
	static byte whatIsThePriceOfTomato(){
		byte price=10;
		return price;
	}
	
	static String whatIsTheColorOfTomato(){
		String color="Red";
		return color;
	}
	
	static float whatIsTheWeightOfTomato(){
		float weight=10.7f;
		return weight;
	}
	
	static double whatIsTheLengthOfTomato(){
		double length=5.9d;
		return length;
	}
}