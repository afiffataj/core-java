class Zepto{
	
	static boolean isProductPurchasable(String product){
		
		if (product == "Pencil"){
			System.out.println("Yes zepto has pencil");
			return true;
		}
		else if(product == "Book"){
			System.out.println("No book is not there in zepto");
			return false;
		}
		else if(product == "Eraser"){
			System.out.println("Yes zepto has eraser");
			return true;
		}
		else if(product == "Notes"){
			System.out.println("No notes is not there in zepto");
			return false;
		}
		else if(product == "Mouisturizer"){
			System.out.println("Yes zepto has Mouisturizer");
			return true;
		}
		else if(product == "Bag"){
			System.out.println("Yes zepto has bag");
			return true;
		}
		else if(product == "Shoes"){
			System.out.println("Yes zepto has shoes");
			return true;
		}
		else if(product == "Bottle"){
			System.out.println("No bottle is not there in zepto");
			return false;
		}
		else if(product == "Cream"){
			System.out.println("No cream is not there in zepto");
			return false;
		}
		else if(product == "fan"){
			System.out.println("Yes zepto has fan");
			return true;
		}
		else {
			System.out.println("The product is not present in zepto");
			return false;
		}
	}
}