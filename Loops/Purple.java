class Purple{
	public static void main(String[] uiytdhg){
		
		System.out.println("The products Of Purple");
		String product1="Mascara";
		String product2="Kajol";
		String product3="Foundation";
		String product4="Rings";
		String product5="Lipstick";
		
		String[] products={product1,product2,product3,product4,product5};
		
		int[] prices={300,600,1900,700,800};
		Purple.cartList(products,prices);
	}
	
	static void cartList(String[] a ,int[] b){
		
		for(String p:a){
			System.out.println(p);
		}
		
		for(int i=0;i<=4;i++){
			System.out.println(a[i]);
		}
		System.out.println();
		
		for(int p:b){
			System.out.println(p);
		}
	}
}
	
		
		