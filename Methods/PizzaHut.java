class PizzaHut{
	
	static String typesOfPizza(String p){
		
		String pizza="Mutton";
		switch (pizza){
			case "Chiken":
			System.out.println("Chiken pizza is available");
			break;
			
			case "Mutton":
			System.out.println("Mutton pizza is available");
			break;
			
			case "Panner":
			System.out.println("Panner pizza is available");
			break;
			
			case "Veg":
			System.out.println("Veg pizza is available");
			break;
			
			default:
			System.out.println("Invalid option");
		}
		return null;
		
	}
}
			