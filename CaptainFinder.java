class CaptainFinder{
   public static String[] getCaptionAndViceCaption(String countryName){
     System.out.println("running getCaptionAndViceCaption in CaptainFinder");
     System.out.println("countryName="+countryName);

    //1.
    if(countryName == "India")
  {
     System.out.println("countryName is India");
     String[] captainNames={"shubman gill","rohit sharma"};
     return captainNames;
  }

     //2.
     if(countryName == "West Indies")
  {
     System.out.println("countryName is west indies");
      String[] captainNames={"shai hope","roston chase"};
     return captainNames;
  }

     //3.
     if(countryName == "Afghanistan")
  {
     System.out.println("countryName is afghanistan");
     String[] captainNames={"hashmatullah shahidi","rashid khan"};
     return captainNames;
  }

     //4.
     if(countryName == "Bangladesh")
  {
     System.out.println("countryName is bangladesh");
     String[] captainNames={"najmul hossain","mehidy hassan miraz"};
     return captainNames;
  }

     //5.
     if(countryName == "Sri Lanka")
  {
     System.out.println("countryName is sri lanka");
      String[] captainNames={"charith asalanka","pathum nissanka"};
     return captainNames;
  }

     //6.
     if(countryName == "Pakistan")
  {
      System.out.println("countryName is pakistan");
     String[] captainNames={"babar azam","shaheen afridi"};
      return captainNames;
  }

      //7.
     if(countryName == "New Zealand")
  {
     System.out.println("countryName is new zealand");
     String[] captainNames={"tom latham","kane williamson"};
     return captainNames;
  }

    //8.
     if(countryName == "South Africa")
  {
     System.out.println("countryName is south africa");
     String[] captainNames={"temba bavuma","aiden maekram"};
     return captainNames;
  }

     //9.
     if(countryName == "England")
  {
     System.out.println("countryName is england");
     String[] captainNames={"jos buttler","ben stokes"};
     return captainNames;
  }

     //10.
     if(countryName == "Australia")
  {
     System.out.println("countryName is australia");
     String[] captainNames={"pat cummins","steve smith"};
     return captainNames;
  }

     System.out.println("if countryName not matching,then print empty");
     String[] empty={};
     return empty;
 }
 }
