class MovieApp{
	 static String[] getMovies(String genres){
		System.out.println("Search Of Movie Types");
		
	 String[] romanticMovies ={ "96", "Sita Ramam", "Dia", "Premam", "Hi Nanna", "Geetha Govindam", 
       " Tholi Prema", "Love Mocktail", "Jab We Met", "Aashiqui 2", 
		"Veer-Zaara", "Kal Ho Naa Ho", "Rockstar", "Raanjhanaa", 
         "Sanam Teri Kasam", "The Notebook", "Titanic", 
        "Me Before You", "The Fault in Our Stars", "La La Land"};
		
	 String[] comedyMovies = {"Hera Pheri", "Phir Hera Pheri", "Dhamaal", "Golmaal", 
       " Welcome", "Chup Chup Ke", "Bhool Bhulaiyaa", 
	 "Munna Bhai M.B.B.S."};
	 
	 String[] horrorMovies ={ "The Conjuring", "Annabelle", "The Nun", "Insidious", 
		 "Sinister", "Tumbbad", "Stree", "Bhool Bhulaiyaa 2"};
		 
	 String[] actionMovies=	{"Godzilla Minus One","the Odysssey","Dune","RRR","Mad Max",
	    "Die Hard","John Wick","The Raid","Terminal 2",};
	 
	 String[] crimeMovies={"The Batman","Sicario","Prisoners","The Town","Drive","Knives Out",
	    "The Godfather","Goodfellas","The Deaparted","City Of God","Heat"};
		
	 String[] adventureMovies={"Jumanji","Jurassic park","Life of Pi","The Revenant","Cast Away",
	    "The Secret Life Of Walter","127 Hours","The Mummy","Raider of the Lost Ark",
		"Stardust"};
		
      String[] familyMovies = {"Taare Zameen Par", "Chhichhore", 
           "Dangal", "Secret Superstar", "English Vinglish","Stanley Ka Dabba",
		   "Bajrangi Bhaijaan"};
		   
		if(genres == "romanticMovies"){
			return romanticMovies;
		}else if(genres == "comedyMovies"){
			return comedyMovies;
		}else if(genres == "horrorMovies"){
			return horrorMovies;
		}else if(genres == "actionMovies"){
			return actionMovies;
		}else if(genres == "crimeMovies"){
			return crimeMovies;
		}else if(genres == "adventureMovies"){
			return adventureMovies;
		}else if(genres == "familyMovies"){
			return familyMovies;
		}else{
			System.out.println("Invalid Movie Type");
			return null;
		}
	}
}                                      