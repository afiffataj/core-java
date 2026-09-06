class MobileStoreRunner {
    public static void main(String[] args) {
       String brand=null;
	   String model="x50";
	   int price=50000;
	   String color="blue";
	  MobileStore.store(brand,model,price,color); 
	  MobileStore.store(null,null,45000,null);
    }
}