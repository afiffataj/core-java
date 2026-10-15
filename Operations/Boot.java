class Boot{
	public static void main(String[] args){
		
		byte a3=10;
		byte b3=10;
		
		byte c3=10;
		byte d3=10;
		byte sum33=(byte)(a3+b3);
		System.out.println(sum33);
		byte sum34=(byte)(a3-b3);
		System.out.println(sum34);
		byte sum35=(byte)(a3*b3);
		System.out.println(sum35);
		byte sum36=(byte)(a3/b3);
		System.out.println(sum36);
		byte sum37=(byte)(a3%b3);
		System.out.println(sum37);
		
		boolean sum38=a3==b3;
		System.out.println(sum38);
		boolean sum39=a3!=b3;
		System.out.println(sum39);
		boolean sum40=a3<b3;
		System.out.println(sum40);
		boolean sum41=a3>b3;
		System.out.println(sum41);
		boolean sum42=a3<=b3;
		System.out.println(sum42);
		boolean sum43=a3>=b3;
		System.out.println(sum43);
		
		if(a3==b3){
			System.out.println("Yes the number is equal");
		}
	    else{
			System.out.println("No the number is not equal");
		}
		
		if(a3!=b3){
			System.out.println("Yes the number is not equal");
		}
	    else{
			System.out.println("No the number is equal");
		}
		
		if(a3<b3){
			System.out.println("Yes the number is lesser");
		}
	    else{
			System.out.println("No the number is not lesser");
		}
		
		if(a3>b3){
			System.out.println("Yes the number is greater");
		}
	    else{
			System.out.println("No the number is not greater");
		}
		
		if(a3<=b3){
			System.out.println("Yes the number is lesserthanequal");
		}
	    else{
			System.out.println("No the number is not lesserthanequal");
		}
		
		if(a3>=b3){
			System.out.println("Yes the number is greaterthanequal");
		}
	    else{
			System.out.println("No the number is not greaterthanequal");
		}
		
		if(a3==b3 && c3==d3){
			System.out.println("Yes the number is equal");
		}
		else{
			System.out.println("No the number is not equal");
		}
		
		if(a3==b3 || c3==d3){
			System.out.println("Yes the number is equal");
		}
		else{
			System.out.println("No the number is not equal");
		}
	}
}