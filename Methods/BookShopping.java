class BookShopping {
	public static void main(String[] args) {

		System.out.println("the price of book");
		short price = BookShopping.bookPrice();
		System.out.println(price);

		System.out.println("the name of book");
		System.out.println(BookShopping.bookName());

		System.out.println("the quantity of book");
		byte quantity = BookShopping.bookQuantity();
		System.out.println(quantity);

		System.out.println("the weight of book");
		float weight = BookShopping.bookWeight();
		System.out.println(weight);

		System.out.println("the number of pages");
		int pages = BookShopping.bookPages();
		System.out.println(pages);

		System.out.println("is book available");
		boolean available = BookShopping.bookAvailable();
		System.out.println(available);
	}

	static short bookPrice() {
		short price = 850;
		return price;
	}

	static String bookName() {
		String name = "Java Programming";
		return name;
	}

	static byte bookQuantity() {
		byte quantity = 5;
		return quantity;
	}

	static float bookWeight() {
		float weight = 0.75f;
		return weight;
	}

	static int bookPages() {
		int pages = 450;
		return pages;
	}

	static boolean bookAvailable() {
		boolean available = true;
		return available;
	}
}