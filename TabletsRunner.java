class TabletsRunner{
	public static void main(String[] args){
		
		Tablets tablets1=new Tablets();
		Tablets tablets2=new Tablets();
		
		System.out.println(tablets1.count);
		System.out.println(tablets1.name);
		System.out.println(tablets1.price);
		System.out.println(tablets1.dosage);
		System.out.println(tablets1.brand);
		System.out.println(tablets1.weight);
		System.out.println(tablets1.quantity);
		System.out.println(tablets1.type);
		System.out.println(tablets1.discount);
		System.out.println(tablets1.color);
		
		tablets2.weight=500.9;
		tablets2.quantity=4;
		tablets2.type="round";
		tablets2.discount=50;
		tablets2.color="white";
		System.out.println(tablets2.count);
		System.out.println(tablets2.name);
		System.out.println(tablets2.price);
		System.out.println(tablets2.dosage);
		System.out.println(tablets2.brand);
		System.out.println(tablets2.weight);
		System.out.println(tablets2.quantity);
		System.out.println(tablets2.type);
		System.out.println(tablets2.discount);
		System.out.println(tablets2.color);
	}
}