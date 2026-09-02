class InjectionRunner{
	public static void main(String[] args){
		
		Injection injection=new Injection();
		Injection injection1=new Injection();
		
		System.out.println(injection.dosage);
		System.out.println(injection.medicine);
		System.out.println(injection.price);
		System.out.println(injection.quantity);
		System.out.println(injection.brand);
		System.out.println(injection.volume);
		System.out.println(injection.age);
		System.out.println(injection.manufacture);
		System.out.println(injection.weight);
		System.out.println(injection.stock);
		
		injection1.volume=20.78;
		injection1.age=35;
		injection1.manufacture="10 years";
		injection1.weight=30.5;
		injection1.stock=3;
		System.out.println(injection1.dosage);
		System.out.println(injection1.medicine);
		System.out.println(injection1.price);
		System.out.println(injection1.quantity);
		System.out.println(injection1.brand);
		System.out.println(injection1.volume);
		System.out.println(injection1.age);
		System.out.println(injection1.manufacture);
		System.out.println(injection1.weight);
		System.out.println(injection1.stock);
		
	}
}