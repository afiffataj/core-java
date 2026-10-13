class ShopingBill{
	public static void main(String[] args){

    System.out.println("the shoping bill of 1 person");
    int billOfPerson1=500;
    ShopingBill.theShopingBillOfPerson1(billOfPerson1);
	
	System.out.println("the shoping bill of 2 person");
    int billOfPerson2=900;
	int billOfPerson3=1100;
    ShopingBill.theShopingBillOfPerson2(billOfPerson2,billOfPerson3);

	System.out.println("the shoping bill of 3 person");
    int billOfPerson4=500;
	int billOfPerson5=800;
	int billOfPerson6=200;
    ShopingBill.theShopingBillOfPerson3(billOfPerson4,billOfPerson5,billOfPerson6);	
	
	System.out.println("the shoping bill of 4 person");
    int billOfPerson7=4400;
	int billOfPerson8=100;
	int billOfPerson9=2000;
	int billOfPerson10=1400;
    ShopingBill.theShopingBillOfPerson4(billOfPerson7,billOfPerson8,billOfPerson9,billOfPerson10);
	
	System.out.println("the shoping bill of 5 person");
    int billOfPerson11=1990;
	int billOfPerson12=9900;
	int billOfPerson13=5600;
	int billOfPerson14=5400;
	int billOfPerson15=3300;
    ShopingBill.theShopingBillOfPerson5(billOfPerson11,billOfPerson12,billOfPerson13,billOfPerson14,billOfPerson15);
	}
	
	static void theShopingBillOfPerson1(int a){
		System.out.println("the shoping bill of person1="+a);
	}
	
	static void theShopingBillOfPerson2(int b,int c){
		System.out.println("the shoping bill of person2="+b);
		System.out.println("the shoping bill of person2="+c);
	}

    static void theShopingBillOfPerson3(int d,int e,int f){
		System.out.println("the shoping bill of person3="+d);
		System.out.println("the shoping bill of person3="+e);
		System.out.println("the shoping bill of person3="+f);
	}
		
    static void theShopingBillOfPerson4(int g,int h,int i,int j){
		System.out.println("the shoping bill of person4="+g);
		System.out.println("the shoping bill of person4="+h);
		System.out.println("the shoping bill of person4="+i);
		System.out.println("the shoping bill of person4="+j);
	}	
	
	static void theShopingBillOfPerson5(int k,int l,int m,int n,int o){
		System.out.println("the shoping bill of person5="+k);
		System.out.println("the shoping bill of person5="+l);
		System.out.println("the shoping bill of person5="+m);
		System.out.println("the shoping bill of person5="+n);
		System.out.println("the shoping bill of person5="+o);
	}
}