class Mart{
	public static void main(String[] args){
		
		String chocolates[]={"Dairy Milk","Kit kat","Toblerone","Milka",
		"Bounty","Galaxy","Ferro Rocher","Hersheys","Kinder","5 Star",
        "Caramilk","Valor","Aero"};
		
		System.out.println(chocolates[0]);
		System.out.println(chocolates[1]);
		System.out.println(chocolates[2]);
		System.out.println(chocolates[3]);
		System.out.println(chocolates[4]);
		System.out.println(chocolates[5]);
		System.out.println(chocolates[6]);
		System.out.println(chocolates[7]);
		System.out.println(chocolates[8]);
		System.out.println(chocolates[9]);
		System.out.println(chocolates[10]);
		System.out.println(chocolates[11]);
		System.out.println(chocolates[12]);
		
		System.out.println("Are chocolates available");
		Mart.isChocolateAvailable();
		
		System.out.println("the Price Of Chocolates");
		int price=Mart.thePriceOfChocolates();
		System.out.println(price);
		
		System.out.println("no Of Pieces of chocolates");
		byte pieces=5;
		Mart.noOfPieces(pieces);
		
		System.out.println("Size of chocolates");
		char size1='M';
		char size2='L';
		Mart.sizeOfChocolates(size1,size2);
		
	}
	static void isChocolateAvailable(){
		System.out.println("Yes chocolates are available");
	}
	
	static int thePriceOfChocolates(){
		int price=2000;
		return price;
	}
	
	static void noOfPieces(byte a){
		System.out.println(a);
	}
	
	static char sizeOfChocolates(char d,char u){
		System.out.println(d);
		System.out.println(u);
		return d;
	}
}
		