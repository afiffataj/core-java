class Gun{
	public static void main(String[] args){
		
		double a5=10000l;
		double b5=10000l;
		
		double c5=100000l;
		double d5=100000l;
		double sum55=a5+b5;
		System.out.println(sum55);
		double sum56=a5-b5;
		System.out.println(sum56);
		double sum57=a5*b5;
		System.out.println(sum57);
		double sum58=a5/b5;
		System.out.println(sum58);
		double sum59=a5%b5;
		System.out.println(sum59);
		
		boolean sum60=a5==b5;
		System.out.println(sum60);
		boolean sum61=a5!=b5;
		System.out.println(sum61);
		boolean sum62=a5<b5;
		System.out.println(sum62);
		boolean sum63=a5>b5;
		System.out.println(sum63);
		boolean sum64=a5<=b5;
		System.out.println(sum64);
		boolean sum65=a5>=b5;
		System.out.println(sum65);
		
		if(a5==b5){
			System.out.println("Yes the number is equal");
		}
	    else{
			System.out.println("No the number is not equal");
		}
		
		if(a5!=b5){
			System.out.println("Yes the number is not equal");
		}
	    else{
			System.out.println("No the number is equal");
		}
		
		if(a5<b5){
			System.out.println("Yes the number is lesser");
		}
	    else{
			System.out.println("No the number is not lesser");
		}
		
		if(a5>b5){
			System.out.println("Yes the number is greater");
		}
	    else{
			System.out.println("No the number is not greater");
		}
		
		if(a5<=b5){
			System.out.println("Yes the number is lesserthanequal");
		}
	    else{
			System.out.println("No the number is not lesserthanequal");
		}
		
		if(a5>=b5){
			System.out.println("Yes the number is greaterthanequal");
		}
	    else{
			System.out.println("No the number is not greaterthanequal");
		}
		
		if(a5==b5 && c5==d5){
			System.out.println("Yes the number is equal");
		}
		else{
			System.out.println("No the number is not equal");
		}
		
		if(a5==b5 || c5==d5){
			System.out.println("Yes the number is equal");
		}
		else{
			System.out.println("No the number is not equal");
		}
	}
}