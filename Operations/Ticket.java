class Ticket{
	public static void main(String[] args){
		
		int a=6170;
		int b=40;
		
		int c=30;
		int d=34;
		int sum=a+b;
		System.out.println(sum);
		int sum1=a-b;
		System.out.println(sum1);
		int sum2=a*b;
		System.out.println(sum2);
		int sum3=a/b;
		System.out.println(sum3);
		int sum4=a%b;
		System.out.println(sum4);
		
		boolean sum5=a==b;
		System.out.println(sum5);
		boolean sum6=a!=b;
		System.out.println(sum6);
		boolean sum7=a<b;
		System.out.println(sum7);
		boolean sum8=a>b;
		System.out.println(sum8);
		boolean sum9=a<=b;
		System.out.println(sum9);
		boolean sum10=a>=b;
		System.out.println(sum10);
		
		if(a==b){
			System.out.println("Yes the number is equal");
		}
	    else{
			System.out.println("No the number is not equal");
		}
		
		if(a!=b){
			System.out.println("Yes the number is not equal");
		}
	    else{
			System.out.println("No the number is equal");
		}
		
		if(a<b){
			System.out.println("Yes the number is lesser");
		}
	    else{
			System.out.println("No the number is not lesser");
		}
		
		if(a>b){
			System.out.println("Yes the number is greater");
		}
	    else{
			System.out.println("No the number is not greater");
		}
		
		if(a<=b){
			System.out.println("Yes the number is lesserthanequal");
		}
	    else{
			System.out.println("No the number is not lesserthanequal");
		}
		
		if(a>=b){
			System.out.println("Yes the number is greaterthanequal");
		}
	    else{
			System.out.println("No the number is not greaterthanequal");
		}
		
		if(a==b && c==d){
			System.out.println("Yes the number is equal");
		}
		else{
			System.out.println("No the number is not equal");
		}
		
		if(a==b || c==d){
			System.out.println("Yes the number is equal");
		}
		else{
			System.out.println("No the number is not equal");
		}
	}
}