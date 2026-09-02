class LensRunner{
	public static void main(String[] args){
		
		Lens lens1=new Lens();
		Lens lens2=new Lens();
		
		System.out.println(lens1.type);
		System.out.println(lens1.focalLength);
		System.out.println(lens1.brand);
		System.out.println(lens1.price);
		System.out.println(lens1.available);
		System.out.println(lens1.grade);
		System.out.println(lens1.diameter);
		System.out.println(lens1.power);
		System.out.println(lens1.color);
		System.out.println(lens1.size);
		
		lens2.grade='A';
		lens2.diameter=3;
		lens2.power=2.75;
		lens2.color="blue";
		lens2.size=1;
		System.out.println(lens2.type);
		System.out.println(lens2.focalLength);
		System.out.println(lens2.brand);
		System.out.println(lens2.price);
		System.out.println(lens2.available);
		System.out.println(lens2.grade);
		System.out.println(lens2.diameter);
		System.out.println(lens2.power);
		System.out.println(lens2.color);
		System.out.println(lens2.size);
}
		
	}