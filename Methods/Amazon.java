class Amazon{
	
	static long productNumbers(String product){
		
		if(product=="Window"){
			System.out.println("Window is available");
			return 9876549l;
		}
		else if(product=="Pillow"){
			System.out.println("Pillow is available");
			return 9876987l;
		}
		else if(product=="Oil"){
			System.out.println("oil is available");
			return 56787698l;
		}
		else if(product=="Headphone"){
			System.out.println("Headphone is available");
			return 1234567l;
		}
		else if(product=="Bed"){
			System.out.println("bed is available");
			return 8765987l;
		}
		else if(product=="Ponds"){
			System.out.println("Ponds is available");
			return 5686987l;
		}
		else if(product=="Gua sha"){
			System.out.println("gua sha is available");
			return 2345687l;
		}
		else if(product=="kurti"){
			System.out.println("Kurti is available");
			return 876587l;
		}
		else if(product=="Fan"){
			System.out.println("fan is available");
			return 789987l;
		}
		else if(product=="BedSheet"){
			System.out.println("BedSheet is available");
			return 123487l;
		}
		else {
			System.out.println("Invalid product Number");
			return 000000l;
		}
	}
}