class CaptainFinderRunner{
   public static void main(String[] args){
     String countryName="West Indies";
     String[] totalCaptainFinder=CaptainFinder.getCaptionAndViceCaption(countryName);
     //System.out.println("totalCaptainFinder="+totalCaptainFinder.length);
     int captions=totalCaptainFinder.length;
     System.out.println("captions="+captions);
   }
 }