class GameOfThrones{
	public static void main(String[] args){
		
		String[] characterNames={"Jon Snow", "Daenerys Targaryen", "Tyrion Lannister",
		"Cersei Lannister", "Jaime Lannister", "Eddard Stark", "Catelyn Stark", "Robb Stark",
		"Sansa Stark", "Arya Stark", "Bran Stark", "Rickon Stark", "Benjen Stark", 
		"Tywin Lannister", "Joffrey Baratheon", "Tommen Baratheon", "Myrcella Baratheon",
		"Lancel Lannister", "Kevan Lannister", "Khal Drogo", "Jorah Mormont", "Petyr Baelish", 
		"Varys", "Sandor Clegane", "Gregor Clegane", "Brienne of Tarth", "Bronn", "Davos Seaworth", 
		"Samwell Tarly", "Gendry", "Night King","Jeor Mormont", "Tormund Giantsbane", 
		"Ygritte", "Gilly", "Eddison Tollett"};
		
		for(int i=0; i <= 35 ; i++){
			System.out.println(characterNames[i]);
		}
		System.out.println();
		
		String realNames[]={"Kit Harington", "Emilia Clarke", "Peter Dinklage", "Lena Headey", 
		"Nikolaj Coster-Waldau", "Sean Bean", "Michelle Fairley", "Richard Madden", "Sophie Turner",
		"Maisie Williams", "Isaac Hempstead Wright", "Art Parkinson", "Joseph Mawle", "Charles Dance",
		"Jack Gleeson", "Dean-Charles Chapman", "Nell Tiger Free", "Eugene Simon", "Ian Gelder",
		"Jason Momoa", "Iain Glen", "Aidan Gillen", "Conleth Hill", "Rory McCann", 
		"Hafþór Júlíus Björnsson", "Gwendoline Christie", "Jerome Flynn", "Liam Cunningham", 
		"John Bradley", "Joe Dempsie", "Vladimir Furdik", "James Cosmo", "Kristofer Hivju",
		"Rose Leslie", "Hannah Murray", "Ben Crompton"};
		
		for(int i=0; i <= 35 ; i++){
			System.out.println(realNames[i]);
		}
		System.out.println();
	     
		int[] salaryOfAuthors={1200000, 1200000, 1200000, 1200000, 1200000,
		0, 0, 0, 175000, 175000, 175000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	     
		for(int i=0; i <= 35 ; i++){
			System.out.println(salaryOfAuthors[i]);
		}
		System.out.println();
		
		String[] rolePlayed={"Main hero, raised as Ned Stark's son", 
		"Mother of Dragons and Targaryen queen claimant", 
		"Clever strategist and political adviser", 
		"Queen of the Seven Kingdoms and political antagonist", 
		"Knight of House Lannister", "Lord of Winterfell and Hand of the King", 
		"Lady of Winterfell and Stark family mother", "King in the North", 
		"Elder Stark daughter who becomes Queen in the North", 
		"Stark daughter trained as an assassin", 
		"Stark son who becomes the Three-Eyed Raven", 
		"Youngest Stark son", "Member of the Night's Watch and Stark uncle", 
		"Powerful head of House Lannister", "Cruel young king", 
		"Young king of the Seven Kingdoms", "Princess of House Baratheon",
		"Member of House Lannister and Cersei's cousin", "Tywin Lannister's younger brother",
		"Leader of the Dothraki people", "Loyal knight and adviser to Daenerys",
		"Political manipulator known as Littlefinger", "Master of Whisperers and royal adviser", 
		"Warrior known as the Hound", "Warrior known as the Mountain", "Honourable female knight",
		"Skilled sellsword and military commander", "Loyal adviser to Stannis and Jon Snow",
		"Member of the Night's Watch and Jon's best friend",
		"Blacksmith and Robert Baratheon's illegitimate son", "Leader of the White Walkers", 
		"Lord Commander of the Night's Watch", "Wildling leader and warrior",
		"Wildling woman and Jon Snow's former love",
		"Wildling woman who becomes Samwell Tarly's partner", "Member of the Night's Watch"};
		
		for(int i=0; i <= 35 ; i++){
			System.out.println(rolePlayed[i]);
		}
	}
}