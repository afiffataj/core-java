class PhotooRunner{
	public static void main(String[] args){
		
		Photoo photoo=new Photoo();
		System.out.println(photoo.name);
		System.out.println(photoo.brand);
		System.out.println(photoo.color);
		System.out.println(photoo.price);
		
		photoo.name="digital";
		photoo.brand="canon";
		photoo.color="blue";
		photoo.price=900;
		System.out.println(photoo.name);
		System.out.println(photoo.brand);
		System.out.println(photoo.color);
		System.out.println(photoo.price);
		
		photoo.color="white";
		photoo.price=10000;
		System.out.println(photoo.color);
		System.out.println(photoo.price);
		
		
		
	}
}