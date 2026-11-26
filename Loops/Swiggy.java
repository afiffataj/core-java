class Swiggy{
	public static void main(String[] tdfxvb){
		
	System.out.println("The price Of Items");
		
    int price1 = 30;
    int price2 = 40;
    int price3 = 8;
    int price4 = 55;
    int price5 = 120;
    int price6 = 60;
    int price7 = 45;
    int price8 = 50;
    int price9 = 20;
    int price10 = 150;
    int price11 = 100;
    int price12 = 60;
    int price13 = 80;
    int price14 = 40;
    int price15 = 35;
    int price16 = 30;
    int price17 = 20;
    int price18 = 50;
    int price19 = 120;
    int price20 = 90;
	
	int[] prices={price2,price4,price6,price8,price10,
	price12,price14,price16,price18,price20};
	Swiggy.addToCart(prices);
	}
	
	static int addToCart(int[] a){
		
		for(int i:a){
			System.out.println(i);
		}
		return 0;
	}
}