class Cricket{
public static void main(String[] args){

int id = 101;
String teamName = "Royal Challengers Bengaluru";
String captain = "Rajat Patidar";
int trophies = 1;
double netRunRate = 0.45;
String homeGround = "M. Chinnaswamy Stadium";
String coach = "Andy Flower";
String owner = "Royal Challengers Sports Pvt Ltd";
boolean qualified = true;
String sponsor = "Qatar Airways";
int matchesPlayed = 14;
int points = 19;
String jerseyColor = "Red";
String city = "Bengaluru";

IndianPremierLeague.info(id, teamName, captain, trophies,netRunRate, 
homeGround, coach, owner,qualified, sponsor, matchesPlayed,points,
 jerseyColor, city);//explicit

IndianPremierLeague.info(102, "Chennai Super Kings", "Ruturaj Gaikwad",
5, 0.72, "M. A. Chidambaram Stadium","Stephen Fleming", "India Cements",
true, "Etihad Airways", 14,20, "Yellow", "Chennai");//implicit
    }
}