class Instamart{
	
	static short areItemsAvailable(String item){
		
		if(item=="Rolls"){
            System.out.println("Yes rolls are available");
            return 500;
		}
		else if(item=="Pasta"){
			System.out.println("Yes pasta is available");
			return 450;
		}
		else if(item=="Noodles"){
			System.out.println("Yes noodles is available");
			return 799;
		}
		else if(item=="Biryani"){
			System.out.println("Yes biryani is available");
			return 390;
		}
		else if(item=="Chats"){
			System.out.println("Yes chats is available");
			return 450;
		}
		else if(item=="Juice"){
			System.out.println("Yes juice is available");
			return 250;
		}
		else if(item=="Ice-Cream"){
			System.out.println("Yes juice is available");
			return 150;
		}
		else if(item=="Pizza"){
			System.out.println("Yes juice is available");
			return 950;
		}
		else if(item=="Panner"){
			System.out.println("Yes juice is available");
			return 760;
		}
		else if(item=="Burger"){
			System.out.println("Yes juice is available");
			return 100;
		}
		else{
			System.out.println("The item is not available");
		}
		return 0;
	}
}