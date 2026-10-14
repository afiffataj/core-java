class Ground{
	public static void main(String[] args){
		
		System.out.println("is the ground open");
		Ground.isGroundOpen();
		
		System.out.println("the Name Of The Ground");
		String nameOfGround=Ground.theNameOfTheGround();
		System.out.println(nameOfGround);
		
		System.out.println("the no of grounds");
		int a=60;
		int b=70;
		Ground.theNoOfGroundsInBigGround(a,b);
	}
	static void isGroundOpen(){
		System.out.println("Yes the ground is open");
	}
	
	static String theNameOfTheGround(){
		String nameOfGround="Chinaswamy";
		return nameOfGround;
	}
	
	static void theNoOfGroundsInBigGround(int a,int b){
		System.out.println("ground a has="+a+"seats");
		System.out.println("ground b has="+b+"seats");
	}
}