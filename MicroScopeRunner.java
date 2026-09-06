class MicroScopeRunner{
	public static void main(String[] args){
		
		MicroScope microscope=new MicroScope();
		System.out.println(microscope.name);
		System.out.println(microscope.brand);
		System.out.println(microscope.color);
		System.out.println(microscope.price);
		
		System.out.println();
		microscope.name="compound student microscope";
		microscope.brand="labcare";
		microscope.color="white";
		microscope.price=3699;
		System.out.println(microscope.name);
		System.out.println(microscope.brand);
		System.out.println(microscope.color);
		System.out.println(microscope.price);
		
		System.out.println();
		microscope.color="black";
		microscope.price=4000;
		System.out.println(microscope.color);
		System.out.println(microscope.price);

	}
}