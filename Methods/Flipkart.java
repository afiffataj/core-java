class Flipkart{
	
	static char sizeOfProduct(String product){
		
		if(product=="Tshirt"){
			System.out.println("Tshirt is the product");
			return 'M';
		}
		else if(product=="Pant"){
			System.out.println("Pant is the product");
			return 'L';
		}
		else if(product=="Heels"){
			System.out.println("Heels is the product");
			return 'J';
		}
		else if(product=="Shirt"){
			System.out.println("Shirt is the product");
			return 'S';
		}
		else if(product=="Whale"){
			System.out.println("Whale is the product");
			return 'L';
		}
		else if(product=="Bag"){
			System.out.println("Bag is the product");
			return 'M';
		}
		else if(product=="Trousers"){
			System.out.println("Trousers is the product");
			return 'X';
		}
		else if(product=="RainCoat"){
			System.out.println("RainCoat is the product");
			return 'K';
		}
		else if(product=="Pen"){
			System.out.println("Pen is the product");
			return 'N';
		}
		else if(product=="Jacket"){
			System.out.println("Jacket is the product");
			return 'L';
		}
		else{
			System.out.println("Invalid product");
			return '0';
		}
	}
}
		