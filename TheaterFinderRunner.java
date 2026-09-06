class TheaterFinderRunner{
   public static void main(String[] args){
    String movieName="Havoc";
    String[] totalTheaterFinder=TheaterFinder.getTheaterByMovieName(movieName);
    System.out.println("totalTheaterFinder="+totalTheaterFinder.length);
 }
 }