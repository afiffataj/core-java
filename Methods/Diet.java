class Diet{
	public static void main(String[] args){
		
		System.out.println("Is diet list of week available");
		Diet.isDietListOfWeekAvailable();
		
		System.out.println("The price of diet list is ");
		int price=Diet.thePriceOfDietList();
		System.out.println(price);
		
		System.out.println("The Number of people in diet");
		int a = 55;
		int b = 89;
        Diet.numberOfPeoplesInDiet(a ,b);

		System.out.println("The number Of Floors");
		byte building1=4;
		byte building2=8;
		byte building3=9;
		Diet.numberOfFloors(building1,building2,building3);
		
	}

         static void isDietListOfWeekAvailable(){
         System.out.println("Yes the diet list of week is available");
		 }		

         static int thePriceOfDietList(){
         int price=4500;
         return price;
		 }
		 
		 static void numberOfPeoplesInDiet(int a ,int b){
			 System.out.println(a);
			 System.out.println(b);
		 }
		 
		 static byte numberOfFloors(byte c,byte d,byte e){
			 System.out.println(c);
			 System.out.println(d);
			 System.out.println(e);
			 return d;
		 }
}