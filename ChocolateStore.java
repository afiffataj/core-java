class ChocolateStore {
    public static void store(String name, int price) {
        System.out.println("Chocolates are stored in ChocolateStore");
        if(name != null) 
		{
            System.out.println("Chocolate name is valid");
        }
        if(price > 0) 
		{
            System.out.println("Price is valid");
        }
    }
}