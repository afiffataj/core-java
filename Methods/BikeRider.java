class BikeRider{
	public static void main(String[] args){

	System.out.println("Petrol needed for 1km in bike");
	int petrola=10;
	BikeRider.petrolNeededFor1Km(petrola);
	
	System.out.println("Petrol needed for 2km in bike");
	int petrolb=20;
	int petrolc=30;
	BikeRider.petrolNeededFor2Km(petrolb,petrolc);
	
	System.out.println("Petrol needed for 3km in bike");
	int petrold=40;
	int petrole=50;
	int petrolf=60;
	BikeRider.petrolNeededFor3Km(petrold,petrole,petrolf);
	
	System.out.println("Petrol needed for 4km in bike");
	int petrolg=70;
	int petrolh=80;
	int petroli=90;
	int petrolj=100;
	BikeRider.petrolNeededFor4Km(petrolg,petrolh,petroli,petrolj);
	
	System.out.println("Petrol needed for 5km in bike");
	int petrolk=110;
	int petroll=120;
	int petrolm=130;
	int petroln=140;
	int petrolo=150;
	BikeRider.petrolNeededFor5Km(petrolk,petroll,petrolm,petroln,petrolo);
	
	
	}
	static void petrolNeededFor1Km(int a){
		System.out.println("petrol for 1km="+a);
	}
	
	static void petrolNeededFor2Km(int b,int c){
		System.out.println("petrol for 2km="+b);
		System.out.println("petrol for 2km="+c);
	}
	
	static void petrolNeededFor3Km(int d,int e,int f){
		System.out.println("petrol for 3km="+d);
		System.out.println("petrol for 3km="+e);
		System.out.println("petrol for 3km="+f);
	}
	
	static void petrolNeededFor4Km(int g,int h,int i,int j){
		System.out.println("petrol for 4km="+g);
		System.out.println("petrol for 4km="+h);
		System.out.println("petrol for 4km="+i);
		System.out.println("petrol for 4km="+j);
	}
	
	static void petrolNeededFor5Km(int k,int l,int m,int n,int o){
		System.out.println("petrol for 5km="+k);
		System.out.println("petrol for 5km="+l);
		System.out.println("petrol for 5km="+m);
		System.out.println("petrol for 5km="+n);
		System.out.println("petrol for 5km="+o);	
	}
}
		