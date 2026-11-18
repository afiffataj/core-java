//static methods-with parameter and without return 
class Camera{
	public static void main(String[] args){
		
		System.out.println("Price of the camera");
		int price1=8768;
		int price2=9999;
		Camera.priceOfTheCamera(price1,price2);
	}
	
	static void priceOfTheCamera(int a,int b){
		System.out.println(a);
		System.out.println(b);
	}
}