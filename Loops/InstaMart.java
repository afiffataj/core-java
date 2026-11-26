class InstaMart{
	public static void main(String[] klhdx){
		
	System.out.println("Product Numbers Of Items");
    long productNumber1 = 987654321;
    long productNumber2 = 876543210;
    long productNumber3 = 765432109;
    long productNumber4 = 654321098;
    long productNumber5 = 543210987;
    long productNumber6 = 432109876;
    long productNumber7 = 321098765;
    long productNumber8 = 210987654;
    long productNumber9 = 198765432;
    long productNumber10 = 187654321;
    long productNumber11 = 176543210;
    long productNumber12 = 165432109;
    long productNumber13 = 154321098;
    long productNumber14 = 143210987;
    long productNumber15 = 132109876;
    long productNumber16 = 121098765;
    long productNumber17 = 109876543;
    long productNumber18 = 998765432;
    long productNumber19 = 887654321;
    long productNumber20 = 776543210;

    long productNumbers[]={productNumber11,productNumber12,productNumber13,productNumber14,
	productNumber15,productNumber16,productNumber17,productNumber18,
	productNumber19,productNumber20};	
	InstaMart.addToCart(productNumbers);
	}
	
	static void addToCart(long[] p){
		
	for(long l:p){
		System.out.println(l);
	}
	}
}