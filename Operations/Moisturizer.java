class Moisturizer{
	public static void main(String[] args){
		
		float a1=900.0f;
		float b1=34.0f;
		
		float c1=479.0f;
		float d1=10.0f;
		float sum11=a1+b1;
		System.out.println(sum11);
		float sum12=a1-b1;
		System.out.println(sum12);
		float sum13=a1*b1;
		System.out.println(sum13);
		float sum14=a1/b1;
		System.out.println(sum14);
		float sum15=a1%b1;
		System.out.println(sum15);
		
		boolean sum16=a1==b1;
		System.out.println(sum16);
		boolean sum17=a1!=b1;
		System.out.println(sum17);
		boolean sum18=a1<b1;
		System.out.println(sum18);
		boolean sum19=a1>b1;
		System.out.println(sum19);
		boolean sum20=a1<=b1;
		System.out.println(sum20);
		boolean sum21=a1>=b1;
		System.out.println(sum21);
		
		if(a1==b1){
			System.out.println("Yes the number is equal");
		}
	    else{
			System.out.println("No the number is not equal");
		}
		
		if(a1!=b1){
			System.out.println("Yes the number is not equal");
		}
	    else{
			System.out.println("No the number is equal");
		}
		
		if(a1<b1){
			System.out.println("Yes the number is lesser");
		}
	    else{
			System.out.println("No the number is not lesser");
		}
		
		if(a1>b1){
			System.out.println("Yes the number is greater");
		}
	    else{
			System.out.println("No the number is not greater");
		}
		
		if(a1<=b1){
			System.out.println("Yes the number is lesserthanequal");
		}
	    else{
			System.out.println("No the number is not lesserthanequal");
		}
		
		if(a1>=b1){
			System.out.println("Yes the number is greaterthanequal");
		}
	    else{
			System.out.println("No the number is not greaterthanequal");
		}
		
		if(a1==b1 && c1==d1){
			System.out.println("Yes the number is equal");
		}
		else{
			System.out.println("No the number is not equal");
		}
		
		if(a1==b1 || c1==d1){
			System.out.println("Yes the number is equal");
		}
		else{
			System.out.println("No the number is not equal");
		}
	}
}