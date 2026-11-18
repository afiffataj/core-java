//static methods-with parameter and with return 
class SmartPhone{
	public static void main(String[] args){
		
		System.out.println("The length Of Smart Phone");
		float length1=685.6f;
		float length2=999.8f;
		SmartPhone.theLengthOfSmartPhone(length1,length2);
	}
	
	static float theLengthOfSmartPhone(float a,float b){
		System.out.println(a);
		System.out.println(b);
		return a;
	}
}
