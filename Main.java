class Main{
	public static void main(String[] args){
		int[] numbers={10,21,30,45,50,77,20,23,56,78,44,36,56,22,23,67,78,35,67,87,48,50};
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]%2==0){
				System.out.println(numbers[i]);
			}
		}
	}
}