class Eligibilty{
	public static void main(String[] args){
		
		System.out.println("Can enter the Playing section");
		int age = 5;
		String result=Eligibilty.canEnterThePlayingSection(age);
		System.out.println(result);
	}
		static String canEnterThePlayingSection(int age){
		if(age >= 15){
			return "Yes they can enter playing section";
		}
		else{
			return "No they cant enter playing section";
		}
	}
}