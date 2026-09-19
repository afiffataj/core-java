class RainCoat{
	public static void main(String[] args){
		System.out.println("RainCoat is used in summer");
		
		String brand="Rainy Coats";
		byte noOfItems=4;
		int price=455;
		short discount=4;
		long pincode=560067l;
		boolean isAvailable=true;
		float weight=7.8f;
  		double length=56.8d;
		char size='L';
		
		System.out.println("brand before re-initalization="+brand);
		System.out.println("noOfItems before re-initalization="+noOfItems);
		System.out.println("price before re-initalization="+price);
		System.out.println("discount before re-initalization="+discount);
		System.out.println("pincode before re-initalization="+pincode);
		System.out.println("isAvailable before re-initalization="+isAvailable);
		System.out.println("weight before re-initalization="+weight);
		System.out.println("length before re-initalization="+length);
		System.out.println("size before re-initalization="+size);
		System.out.println();
		
		brand="winter Coats";
		noOfItems=5;
		price=500;
		discount=23;
		pincode=560056l;
		isAvailable=false;
		weight=6.8f;
  		length=90.8d;
		size='M';
		
		System.out.println("brand after re-initalization="+brand);
		System.out.println("noOfItems after re-initalization="+noOfItems);
		System.out.println("price after re-initalization="+price);
		System.out.println("discount after re-initalization="+discount);
		System.out.println("pincode after re-initalization="+pincode);
		System.out.println("isAvailable after re-initalization="+isAvailable);
		System.out.println("weight after re-initalization="+weight);
		System.out.println("length after re-initalization="+length);
		System.out.println("size after re-initalization="+size);
	}
}
		