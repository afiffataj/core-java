class Uber{
	
	static double noOfKilometer(String km){
		
		if(km=="Mysuru"){
			System.out.println("Mysuru is far");
			return 500.9d;
		}
		else if(km=="Delhi"){
			System.out.println("Delhi is far");
			return 566.7d;
		}
		else if(km=="Jaynagar"){
			System.out.println("Jaynagar is far");
			return 900.9d;
		}
		else if(km=="JpNagar"){
			System.out.println("JpNagar is far");
			return 677.7d;
		}
        else if(km=="Tumkur"){
			System.out.println("Tumkur is far");
			return 766.7d;
		}
		else if(km=="Rajajinagar"){
			System.out.println("Rajajinagar is far");
			return 11.7d;
		}
		else {
			System.out.println("Invalid km");
			return 0.0d;
		}
	}
}