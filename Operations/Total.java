class Total{
	public static void main(String[] args){
		
		double a2=300.0d;
		double b2=300.0d;
		
		double c2=300.0d;
		double d2=300.0d;
		double sum22=a2+b2;
		System.out.println(sum22);
		double sum23=a2-b2;
		System.out.println(sum23);
		double sum24=a2*b2;
		System.out.println(sum24);
		double sum25=a2/b2;
		System.out.println(sum25);
		double sum26=a2%b2;
		System.out.println(sum26);
		
		boolean sum27=a2==b2;
		System.out.println(sum27);
		boolean sum28=a2!=b2;
		System.out.println(sum28);
		boolean sum29=a2<b2;
		System.out.println(sum29);
		boolean sum30=a2>b2;
		System.out.println(sum30);
		boolean sum31=a2<=b2;
		System.out.println(sum31);
		boolean sum32=a2>=b2;
		System.out.println(sum32);
		
		if(a2==b2){
			System.out.println("Yes the number is equal");
		}
	    else{
			System.out.println("No the number is not equal");
		}
		
		if(a2!=b2){
			System.out.println("Yes the number is not equal");
		}
	    else{
			System.out.println("No the number is equal");
		}
		
		if(a2<b2){
			System.out.println("Yes the number is lesser");
		}
	    else{
			System.out.println("No the number is not lesser");
		}
		
		if(a2>b2){
			System.out.println("Yes the number is greater");
		}
	    else{
			System.out.println("No the number is not greater");
		}
		
		if(a2<=b2){
			System.out.println("Yes the number is lesserthanequal");
		}
	    else{
			System.out.println("No the number is not lesserthanequal");
		}
		
		if(a2>=b2){
			System.out.println("Yes the number is greaterthanequal");
		}
	    else{
			System.out.println("No the number is not greaterthanequal");
		}
		
		if(a2==b2 && c2==d2){
			System.out.println("Yes the number is equal");
		}
		else{
			System.out.println("No the number is not equal");
		}
		
		if(a2==b2 || c2==d2){
			System.out.println("Yes the number is equal");
		}
		else{
			System.out.println("No the number is not equal");
		}
	}
}