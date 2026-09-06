class Lock{
 public static void main(String[] args){

int id = 101;
String name = "Metal Keychain";
String type = "Car Keychain";
int price = 250;
double weight = 35.5;
String color = "Silver";
String material = "Steel";
String brand = "Wildcraft";
boolean isAvailable = true;
String shape = "Round";
String size = "Medium";
String manufacturer = "Wildcraft India";
String country = "India";

Keychain.info(id, name, type, price, weight, color, material,
          brand, isAvailable, shape, size, manufacturer, country);
		  //explicit

Keychain.info(102, "Leather Keychain", "Bike Keychain", 350,
      40.0, "Brown", "Leather", "Puma", true, "Oval", "Large",
	  "Puma India", "Vietnam");//implicit
    }
}