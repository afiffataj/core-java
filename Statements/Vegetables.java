class Vegetables{
	public static void main(String[] args){
		
		System.out.println("Vegetables of market");
		Vegetables.areVegetablesAreInMarket();
	}
		static String areVegetablesAreInMarket(){
			String vegi="Potato";
			
			switch (vegi){
				case ("Tomato"):
				System.out.println("Tomato is red in color");
				break;
				
				case ("Potato"):
				System.out.println("Potato is brown in color");
				break;
				
				case ("Beans"):
				System.out.println("Beans is green in color");
				break;
				
				default :
				System.out.println("Vegetables not found");
				
				}
								return vegi;

		}
}
			