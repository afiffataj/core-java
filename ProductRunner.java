class ProductRunner{
	public static void main(String[] values){
		String productName="laptop";
		String brand="dell";
        int refName=Product.cost(productName);
        double refName1=Product.weight(productName,brand);
        int refName2=Product.warranty(productName,brand);
        System.out.println("refName="+refName);
        System.out.println("refName1="+refName1);
        System.out.println("refName2="+refName2);
	}
}