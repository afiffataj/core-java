class InstaxCamera{
    public static void main(String[] args){
		System.out.println("InstaxCamera is used to click photos");
		
		int price=3499;
		String brand="Instax";
		byte noOfItem=1;
		double weight=476.78d;
		short warrenty=4;
		char size='M';
		
		System.out.println("price before re-initalization="+price);
		System.out.println("brand before re-initalization="+brand);
		System.out.println("noOfItem before re-initalization="+noOfItem);
		System.out.println("weight before re-initalization="+weight);
		System.out.println("warrenty before re-initalization="+warrenty);
		System.out.println("size before re-initalization="+size);
		System.out.println();
		
		price=3000;
		brand="Polarid";
		noOfItem=5;
		weight=23.9d;
		warrenty=1;
		size='L';
		
		System.out.println("price after re-initalization="+price);
		System.out.println("brand after re-initalization="+brand);
		System.out.println("noOfItem after re-initalization="+noOfItem);
		System.out.println("weight after re-initalization="+weight);
		System.out.println("warrenty after re-initalization="+warrenty);
		System.out.println("size after re-initalization="+size);
	}
}