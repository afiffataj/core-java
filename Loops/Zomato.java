class Zomato{
	public static void main(String[] args){
		
	System.out.println("The Length of items");
	
	float length1 = 1.0f;
    float length2 = 0.5f;
    float length3 = 0.3f;
    float length4 = 0.2f;
    float length5 = 0.4f;
    float length6 = 5.0f;
    float length7 = 1.0f;
    float length8 = 1.0f;
    float length9 = 0.5f;
    float length10 = 1.0f;
    float length11 = 0.2f;
    float length12 = 0.2f;
    float length13 = 0.3f;
    float length14 = 0.4f;
    float length15 = 0.3f;
    float length16 = 0.3f;
    float length17 = 0.2f;
    float length18 = 0.1f;
    float length19 = 0.5f;
    float length20 = 0.2f;
	
	float[] lengths={length1,length3,length4,length6,length10,length12,
	length15,length18,length19,length20};
	Zomato.addToCart(lengths);
	}
	
	static void addToCart(float[] f){
		
		for(float t:f){
			System.out.println(t);
		}
	}
}