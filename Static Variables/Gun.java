class Gun{
	static String type;
	static int cost;
	static byte discount;
	static long productNo;
	static float weight;
	static char size;
	
	
	public static void main(String[] args){
		System.out.println("Gun is harmfull device");
		
		String brand="Glock";
		int manufcture=2026;
		double length=45;
		
	    Gun.type="Ak47";
	    Gun.cost=45000;
	    Gun.discount=56;
	    Gun.productNo=4567890987l;
	    Gun.weight=67.8f;
	    Gun.size='L';
		
		System.out.println("type="+Gun.type);
		System.out.println("cost="+Gun.cost);
		System.out.println("discount="+Gun.discount);
		System.out.println("productNo="+Gun.productNo);
		System.out.println("weight="+Gun.weight);
		System.out.println("size="+Gun.size);
		System.out.println("brand="+brand);
		System.out.println("manufcture="+manufcture);
		System.out.println("length="+length);
	}
}
		
		