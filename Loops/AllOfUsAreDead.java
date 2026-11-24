class AllOfUsAreDead{
	public static void main(String[] args){
		
	String[] characters={"Lee Cheong-san", "Nam On-jo", "Choi Nam-ra", "Lee Su-hyeok",
	"Yoon Gwi-nam", "Lee Na-yeon", "Yang Dae-su", "Jang Ha-ri", "Jang Woo-jin", "Seo Hyo-ryung",
	"Kim Ji-min", "Oh Joon-yeong", "Min Eun-ji", "Kim Cheol-soo", "Lee Byeong-chan", "Nam So-ju",
	"Park Hee-su", "Song Jae-ik", "Jeon Ho-cheol", "Han Gyeong-su", "Kim Hyeon-ju", "Yoon I-sak", 
	"Lee Jin-su", "Park Sun-hwa", "Kang Jin-gu", "Cho Dal-ho"};
	
	for(int i=0;i<=25;i++){
		System.out.println(characters[i]);
	}
	System.out.println();
	
	byte ages[]={25, 23, 26, 27, 28, 32, 24, 31, 24, 24, 23, 32, 31, 22, 52, 56, 22, 42, 41,
	28, 33, 22, 34, 43, 44, 46};
	
	for(int i=0;i<=25;i++){
		System.out.println(ages[i]);
	}
	System.out.println();
	
	String[] directorNames={"Lee Jae-kyoo", "Kim Nam-su"};
	
	for(int i=0;i<=1;i++){
		System.out.println(directorNames[i]);
	}
	}
}