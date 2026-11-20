class Vote{
	public static void main(String[] args){
		
		System.out.println("is the person aligible to vote");
		int age = 5;
		String result = Vote.isPersonAigibleToVote(age);
		System.out.println(result);
		
	}
		static String isPersonAigibleToVote(int age){
		
		if(age == 1){
			return "Yes they can vote";
		}else if(age == 5){
			System.out.println("hwjd");
			return "no they cant vote";
		}
		else if (age == 7){
			return "invaild age";
		}
			else {
				return "child";
			}
		
		}
}