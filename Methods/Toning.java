class Toning{
	
	static float orderNumber(String item){
		
		if(item=="Pizza"){
			System.out.println("Pizza is available");
			return 101.1f;
		}
		else if(item=="Burger"){
			System.out.println("Burger is available");
			return 102.5f;
		}
		else if(item=="Pasta"){
			System.out.println("Pasta is available");
			return 103.9f;
		}
		else if(item=="Mayo"){
			System.out.println("Mayo is available");
			return 104.8f;
		}
		else if(item=="Ketchup"){
			System.out.println("Ketchup is available");
			return 105.5f;
		}
		else if(item=="Chiken"){
			System.out.println("Chiken is available");
			return 106.1f;
		}
		else if(item=="Onion"){
			System.out.println("Onion is available");
			return 107.9f;
		}
		else if(item=="Pepsi"){
			System.out.println("Pepsi is available");
			return 108.2f;
		}
		else if(item=="Lava Cake"){
			System.out.println("Lava Cake is available");
			return 109.7f;
		}
		else if(item=="Cheese"){
			System.out.println("Cheese is available");
			return 201.5f;
		}
		else {
			System.out.println("Invalid order Number");
		}
		return 0.0f;
	}
}
		