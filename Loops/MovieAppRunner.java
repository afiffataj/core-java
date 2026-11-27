class MovieAppRunner{
	public static void main(String[] args){
		
		String genres="horrorMovies";
		String[] movieList=MovieApp.getMovies(genres);
		
		if(genres == "horrorMovies"){
			
		for(String movie:movieList){
			System.out.println(movie);
		}
		}else{
			System.out.println("Invalid movie type");
		}
		}
	}
